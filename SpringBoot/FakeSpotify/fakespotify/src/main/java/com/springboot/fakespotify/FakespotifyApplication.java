package com.springboot.fakespotify;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FakespotifyApplication {

	public static void main(String[] args) {
		SpringApplication.run(FakespotifyApplication.class, args);
			/**
	 * - Extensiones como @anotations o xml supportes son bienvenidas
	 * - java web supporter como extensión puede servir
	 * 
	 * WAR
	 * Web Application API
	 * - Es un archivo de aplicación web, básicamente un JAR especial utilizado para
	 * distribuir una colección de JavaServer Pages, servlets, clases JAVA, archivos XML,
	 * JSON, bibliotecas de tags, static webs (HTML y relacionados) que juntos constituyen
	 * una aplicación web.
	 * 
	 * Java Servlet
	 * Es una clase en el lenguaje de JAVA, utilizada para amplicar y controlar las capacidades
	 * de un servidor, puede responder a cualquier tipo de solicitudes, pero comunmente
	 * se utilizan para extender las aplicaciones alojadas en un web server.
	 * Applets, que son los que se ejecutan en servidores en vez de navegadores web.
	 * 
	 * Pequeños programas que se ejecutan en el contexto de un navegador web.
	 * 
	 * JPA
	 * Java Persistence API, es la API de persistencia desarrollada para la plataforma de JAVA.
	 * Es un framework de JAVA que maneja datos relacionales en apps usando JAVA.
	 * - Lenguaje de consulta JPQL (Java Persistence Query Language)
	 * - Metadata objeto/relacional (@anotations)
	 * - La definición del paquete javax.persitence
	 * 
	 * MAVEN
	 * - Gestión y construcción de proyectos, similar a lo que es Apache Ant o PEAR.
	 * - Basado en XML
	 * - De construcción simple
	 * - Maneja dependencias y configuracionesprincipales del proyecto
	 * - Este utiliza el conocido POM (Porject Object Model):
	 * - Describe el proyecto de SW a construir.
	 * - Describe dependencias de otros módulos y componentes externos, el orden de
	 * construcción de los elementos.
	 * - Tiene tareas muy definidas, compilación de código, empaquetado de código.
	 * - Está lista para usar en red o en server.
	 * - El motor incluído en su núcleo puede dinámicamente descargar plugins de un repo,
	 * de cualquier lado externo.
	 * - Puede controlar los artefactos y subirlos a repos para construcciones de apps,
	 * dando accesos a todos los usuarios.
	 * Posee una caché para sincronizar artefactos.
	 * 
	 * 
	 * SPRING BOOT
	 * Framework
	 * 
	 * 
	 * properties: Acá le pongo las credenciales y propiedades y configs
	 * spring.jpa.hibernate.ddl-auto:
	 * Manejo de la abse de datos:
	 * - = none -> Database First, la bd se crea manualmente
	 * - = update -> Code First, la bd se crea automáticamente
	 * 
	 */
	}

}
