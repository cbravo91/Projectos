package com.mvc.mvcejercicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MvcejercicioApplication {

	public static void main(String[] args) {
		SpringApplication.run(MvcejercicioApplication.class, args);
		// ./mvnw spring-boot:run
		
		/*
		MVC 
		Patrón arquitectónico
		Reemplazable y modular
		Puede contener n vistas
		Puedo hacer un deploy de un componente sin molestar al resto.

		Modelo - Vista - Controlador

		Modelo: datos o información que manejará la aplicación web
		Vista: Todos los componentes y elementos de la UI, con los que el usuario interactuará
		Controlador: Encargado de manipular los datos en base a la interacción del usuario.

		SPRING MVC 
		El núcleo DispatcherServlet que extiende la clase HTTPServlet. Este componente recibe las peticiones
		HTTP y genera la respuesta adecuada a tal petición que generalmente se configura utilizando el archivo
		web.xml.
		Con Servlet 3.0 para arriba esto se puede hacer de manera programática

		Funcionamiento básico del dispatcher:
		1) Usuario envía una petición, a un index.html, el controller maneja dicho llamado y analiza la URL
		para determinar cual es el controlador indicado para la misma.
		2) El controller usualmente accede a la base de datos y rellena el modelo con los datos requeridos
		para generar la vista, el modelo es enviado de regreso al front controller junto con el nombrelógico
		de la vista.
		3) El componente encargado de generar las vistas es el View Template, que utiliza al modelo yla tecnología
		de vista que se haya configurado para generar la vista final, puede ser HTML, PDF, XLS
		esté preparada será devuelta al Front Controller quien la pone a disposición del usuario.

		Procesamiento:
		En Spring el Front Controller se maneja con DispatcherServlet
		HandlerMapping para los URLs y las llamadas de petición
		Cuando se devuelve un nombre lógico de vista a mostrar, se utiliza manejo de String
		(JSF Java Server File)
		ViewResolver se encarga de averiguar el nombre físico de la vista, que muestra
		los resultados de la operación realizada.

		THYMELEAF
		Es fácil de manejar las vistas, pero consumen mucho recursos.
		Es un motor de plantillas o templates, son para JAVA tanto web como standalone.
		Construido sobre estándares HTML.

		Características
		Los @controller de Spring pueden redireccionarse a los templates de Thymeleaf de la
		misma forma que se podía hacer con JSP.
		Permite el uso de Spring Expression Language (SEL)
		Los formularios se integran perfectamente con los Beans y los Result Bindings de Spring,
		así como con los manejadores de errores.
		Permite uso de MessageSource de Spring.




		*/
	}

}
