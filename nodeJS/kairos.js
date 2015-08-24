var request = require('request');
var http = require('http');
var fs = require('fs');
var url = require('url');


request({
  method: 'POST',
  url: 'https://api.kairos.com/enroll',
  headers: {
    'Content-Type': 'application/json',
    'app_id': '4985f625',
    'app_key': '4423301b832793e217d04bc44eb041d3'
  },
  body: "{\"image\": \"http://media.kairos.com/kairos-elizabeth.jpg\",\"subject_id\": \"subtest1\",\"gallery_name\": \"gallerytest1\",\"selector\": \"SETPOSE\",\"symmetricFill\": \"true\"}"}, 

  function (error, response, body) {
  	//console.log('Status:', response.statusCode);
  	//console.log('Headers:', JSON.stringify(response.headers));
  	console.log('Response:', body);


var server = http.createServer(function(request, response) {
	response.writeHead(200,{"Content-Type": "text/html"});
	if(request.url =="/"){
		response.write(body);
	
	}else if(request.url == "/bemvindo"){
		response.write("<h1>Bem-vindo :)</h1>");
	}else{
		response.write("<h1>Página não encontrada :(</h1>");
}
response.end();
});




server.listen(3000, function(){
  console.log('server kairos');
});

});