
function contar_caracteres(){
var texto = document.getElementById('texto').value;
var longitud = texto.replace(/\s/g, "");
document.getElementById("longitud").innerHTML ="Longitud de caracteres :"+ longitud.length;
}