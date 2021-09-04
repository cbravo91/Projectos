var resultado= document.createElement('h3'); 
function calcular_distancia(){

  let distancia= document.getElementById('distancia').value;
  
if( distancia>=0 && distancia<=1000)
    {
        resultado.innerText="pie";
       
    }
    else if(distancia>1000 && distancia<=10000){
        resultado.innerText="bicicleta";
       
    }
    else if(distancia>10000 && distancia<=30000){
        resultado.innerText="colectivo";
        
    }
    else if(distancia>30000 && distancia<=100000){
        resultado.innerText="auto";
        
    }
    else if(distancia>100000){
        resultado.innerText="avión";
        
    }
    else{
        resultado.innerText="ingrese otro valor";
        
    }
    
    document.body.appendChild(resultado)

    
};
