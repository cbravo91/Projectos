function aprobados(){
var alumnos = [

    { nombre: 'Juan Gomez', nota: 7
  
    }, { nombre: 'Pedro Rodriguez', nota: 4
  
    }, { nombre: 'Roxana García', nota: 8
  
    }, { nombre: 'Luciano Lopez', nota: 5
  
    }, { nombre: 'Fernanda Gimenez', nota: 6
  
    }, { nombre: 'Florencia Martinez', nota: 10
  
    }, { nombre: 'Raul Sanchez', nota: 7
  
    }, { nombre: 'Sandra Figueroa', nota: 8
  
    }
  
  ];
  console.log(alumnos);
var aprobados= alumnos.filter(function(aprobado){
    return aprobado.nota >= 7;});

    aprobados.forEach(element => {var mostrar_alumnos=document.createElement('h3');
    mostrar_alumnos.innerText="Alumno : " + element.nombre + " Nota : "+ element.nota ;
    document.body.appendChild(mostrar_alumnos);})


}
