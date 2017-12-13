var baseUrl = "";

var mchart = null;
var echart = null;

function getServletUrl(sub) {
	return baseUrl + sub;
}

function simpleFormat(real) {
	var rr = Math.round(real*10);
	var prev = Math.floor(rr/10);
	var last = rr-prev*10;
	if (last == 0) {
		return ""+prev;
	} else {
		return prev+","+last;
	}
	return str;
}

function getTotalStatus() {
	var xmlHttp = new XMLHttpRequest();
	xmlHttp.open("GET",getServletUrl("modelinfo"),true);
	xmlHttp.onreadystatechange = function() {
		if (xmlHttp.readyState != 4) {return;}
		var ret = JSON.parse(xmlHttp.responseText);
		//Ignoriere Kosten
		parseModelInfo(ret);
	};
	xmlHttp.send(null);
}

function parseModelInfo(ret) {
	var prodCount = ret.products;

	$('#status_produced').text(prodCount);
	var cost= ret.cost;
	$('#status_cost').text(cost);
	var errorrate = ret.errorrate;
	var str = simpleFormat(errorrate*100)+" %";
	$('#status_errorrate').text(str);
	var latency = ret.latency;
	var round = simpleFormat(latency/1000)+ " s";
	$('#status_latency').text(round);
}

function getChartData() {
	if (!mchart) {return null;}
	return mchart.data.datasets[0].data;
}

function getEChartData() {
	if (!echart) {return null;}
	return echart.data.datasets[0].data;
}

var finished = true;
var lastUpdateC = -1;
var lastUpdateE = -1;
var addedPointsC = 0;
var addedPointsE = 0;

function repeatChartData() {
	if (lastUpdateC != -1 && lastUpdateC < new Date().getTime()-1000) {
		var data = getChartData();
		if (data && data.length && !finished) {
			
			data.push({x: data[data.length-1].x+1000, y: data[data.length-1].y});
			mchart.update();
			lastUpdateC = new Date().getTime();
			++addedPointsC;
		}
	}
	if (lastUpdateE != -1 && lastUpdateE < new Date().getTime()-1000) {
		data = getEChartData();
		if (data && data.length && !finished) {
			data.push({x: data[data.length-1].x+1000, y: data[data.length-1].y});
			echart.update();
			lastUpdateE = new Date().getTime();
			++addedPointsE;
		}
	}
}

window.setInterval(repeatChartData,100);

function setChartData(data) {
	if (!mchart) {return null;}
	mchart.data.datasets[0].data = data;
	mchart.update();
}

function setEChartData(data) {
	if (!echart) {return null;}
	echart.data.datasets[0].data = data;
	echart.update();
}



function clearThings() {
	$('#status_produced').text("?");
	$('#status_errorrate').text("? %");
	$('#status_latency').text("? s");
	var chartData = getChartData();
	if (chartData) {
		chartData.length=0;
	}
	 chartData = getEChartData();
	if (chartData) {
		chartData.length=0;
	}
}

function webSocket(myComponent,idPart) {
	var ws = new WebSocket("ws://"+window.location.host+"/socket");
	ws.onmessage = function(msg) {
		var data = msg.data;
		var json = JSON.parse(""+data);
		var type = json.type;
		if (type=="finished") {
			finished = true;
			getTotalStatus();
		} else if (type =="started") {
			clearThings();
			finished = !!json.finished;
			delta = 0;
		} else if (type =="modelinfo") {
			parseModelInfo(json);
		} else if(type == "utilization") {
			finished = !!json.finished;
			var time = json.time;
			var cmp = json.component;
			//device_SchlechterDrucker_3_utilisation
			//device_SchlechterDrucker3_utilisation
			var utilization = json.utilization;
			var utilstr = simpleFormat(utilization*100)+" %";
			$("#device_"+cmp+"_utilisation").text(utilstr);
		} else if(type == "store") {
			finished = !!json.finished;
			var time = json.time;
			var cmp = json.component;
			var prev = json.prevCount;
			var ec = json.eleCount;
			$("#device_"+cmp+"_elements").text(ec);
			if (echart) {
				var data =  getEChartData();
				lastUpdateE = new Date().getTime();
				
				while (addedPointsE) {
					data.pop();
					--addedPointsE;
				}
				if (prev != ec) {
					data.push({x: time, y: prev});
				}
				data.push({x: time, y: ec});
				echart.update();
			}
		} else if (type == "busyState") {
			finished = !!json.finished;
			var time = json.time;
			var cmp = json.component;
			var wasState = json.wasBusy?1:0;
			var isState = json.isBusy?1:0;
		//	alert("BusyState chart: "+mchart);
			if (mchart) {
				var data =  getChartData();
				lastUpdateC = new Date().getTime();
				
				while (addedPointsC) {
					data.pop();
					--addedPointsC;
				}
				if (wasState != isState) {
					data.push({x: time, y: wasState});
				}
				data.push({x: time, y: isState});
				mchart.update();
			}
		}
	}
	ws.onopen = function(msg) {
		ws.send(myComponent);	
	}
}

function restartSimulation() {
	var xmlHttp = new XMLHttpRequest();
	xmlHttp.open("GET",getServletUrl("restart"),true);
	xmlHttp.send(null);
}


function createChart() {
	var ctx = document.getElementById('utilisationChart');
	if (!ctx) {return;}
	mchart = new Chart(ctx, {
		  type: 'line',
    data: {
        datasets: [{
            label: 'Working',
            data: [],
            backgroundColor: [
                'rgba(255,99,132,0.2)'
            ],
            borderColor: [
                'rgba(255,99,132,1)'
            ],
            borderWidth: 1
        }]
    },
    options: {
		elements: {
        line: {
            tension: 0
        }
       },
        scales: {
			xAxes: [{
				type: 'time',
				position: 'bottom',
				ticks: {
				  maxRotation: 0,
				  minRotation: 0
				}
			}],
            yAxes: [{
				ticks: {
					beginAtZero: true,
					stepSize:1,
					max:1,
					 callback: function(value, index, values) {
                                return value?"Yes":"No";
                            }
				
				}
            }]
        }
    }
	});
	
	 ctx = document.getElementById('storeChart');
	if (!ctx) {return;}
	echart = new Chart(ctx, {
		  type: 'line',
    data: {
        datasets: [{
            label: 'Element count',
            data: [],
            backgroundColor: [
                'rgba(255,99,132,0.2)'
            ],
            borderColor: [
                'rgba(255,99,132,1)'
            ],
            borderWidth: 1
        }]
    },
    options: {
		elements: {
        line: {
            tension: 0
        }
       },
        scales: {
			xAxes: [{
				type: 'time',
				position: 'bottom',
				ticks: {
				  maxRotation: 0,
				  minRotation: 0
				}
			}],
            yAxes: [{
				ticks: {
					beginAtZero: true,
					stepSize:1,
				}
            }]
        }
    }
	});
}