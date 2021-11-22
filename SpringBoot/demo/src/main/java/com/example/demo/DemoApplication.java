package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		/*
		Extensiones como @anotations o xml supportes son bienvenidas java web supporter
		como extensión puede servir

		WAR
		Web Application API
		- Es un archivo de aplicación web, básicamente un JAR especial utilizado para distribuir
		una colección de JavaServer Pages, servlets, clases JAVA, archivos XML.
		JSON, bibliotecas de tags, statics webs (HTML y relacionados) que juntos consittuyen una aplicación web

		Java Servlet
		Es una clase en el lenguaje de JAVA, utilizada para ampliar y controlar las capacidades de un servidor, puede
		responder a cualquier tipo de solicitudes, pero comunmente se utilizan para extender las aplicaciones
		alojadas en un web server.
		Applets, que son los que se ejecutan en servidores en vez de navegadores web.

		Son pequeños programas que se ejecutan en el contexto de un navegador web, no tiene 
		la capacidad de pegarle al servidor por su cuenta.
		
		JPA 
		Java Persistence, es la api de persistencia desarrollada para la plataforma de JAVA.
		Es un framework de JAVA, que maneja datos relacionales en apps usando JAVA.
		- Lenguaje de consulta JPQL (Java Persistence Query Language)
		- Metadata objeto/relacional (@annotations)
		- La definición del paquete javax.persistence

		SPRING BOOT viene de Spring Framework, es más liviano especialmente para web.
		Spring es más pesado.
		
		Framework
		*/ 
	}

}
