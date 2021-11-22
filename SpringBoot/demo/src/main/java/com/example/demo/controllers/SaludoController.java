package com.example.demo.controllers;

import java.util.concurrent.atomic.AtomicLong;

import com.example.demo.models.Saludo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//como le digo a JAVA y Spring que esto es un controlador
//@RestController para decirle a JAVA que esto es un controlador de naturaleza REST
@RestController
// @Controller y @ResponseBody shortcut
public class SaludoController {
    private static final String template = "hola, %s!";
    private final AtomicLong contador = new AtomicLong();
    
    //NO NECESITO CONSTRUCTOR
    //@GetMapping es la anotación que se asegura que hay un Request HTTP GET

    // EN ESTE CASO llamamos a [llamada a la api]/saludo, ej: example.com.demo/saludo
    // llamada a la api = URL base de API
    @GetMapping("/saludo")

    // /saludo/{nombre}    --> /saludo/variableNombre saluda a quien yo quiero
    public Saludo saludo(
        //@RequestParam es la anotación para requerimiento de un parametro en la Request.
        /**
         * enlaza el valor de un parametro entrante de la query, en uno que yo tengo
         * dentro de mi modelo, y puedo tener un valor Default por si no me ponen nada.
         */
        @RequestParam(value = "nombre", defaultValue = "persona") String nombre) {
            return new Saludo(contador.incrementAndGet(), String.format(template, nombre));
        }

        // ./mvnw spring-boot:run -> en terminal para correr

        // sino: ./mvnw clean package
        // java -jar o -war target/saludo-rest-service-0.1.0.jar

        //http://localhost:8080/saludo?nombre=User
        //http://localhost:8080/saludo?nombre="Nico"

    // para POSTS: postMapping
    // RequestMapping(method = GET)
}


