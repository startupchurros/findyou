function enviar(){
var formData = new FormData();
var arquivo = document.getElementById("arquivoInput").files[0];
formData.append("file", arquivo);
var xhr = new XMLHttpRequest();
xhr.onreadystatechange = function() {
  if (xhr.readyState == 4) {
  	var div = document.getElementById('mensagem');
    var resposta = xhr.responseText;
    div.innerHTML += resposta;
    }
  }
  xhr.open("POST", "http://localhost:8080/api/upload");
  xhr.send(formData);
}