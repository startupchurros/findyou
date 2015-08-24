var http = require('http');
var url = require('url');

var server = http.createServer(function (request, response) {
	response.writeHead({"Content-Type" :"text/html"});
	response.write("<h1>Dados da query</h1>");
	var result = url.parse(request.url, true);
		for (var key in result.query){
			response.write("<h2>"+key+ " : " +result.query[key]+"</h2>");
				}
	response.end();
	});
server.listen(3000,function(){
	console.log('seervidor http.')
})