package com.biblioteca.practica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PracticaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticaApplication.class, args);
	}

	/*
	SPRING
	- Tiene una arquitectura ligera
	- Entiende de arquitecturas de manera natural
	- Contiene un conjunto de anotaciones.
	- Tiene un core que entiende sus propias herramientas
	- Categoriza cada uno de los componentes asociandoles una responsabilidad concreta
	Estereotipos:

	bean: Es un componente de software que sería reutilizable.
	- Implementación en serie
	- Tiene todos sus atributos privados por naturalidad
	- Tiene métodos set y get públicos de los atributos privados que nos interese
	- Tiene un constructor público por defecto.


	Por ahora, existen 4 pilares de estereotipos:
	- @Component: Es el estereotipo madre, el estereotipo general, y permite anotar un bean para que 
	Spring lo considere uno de sus objetos.
	- @Repository: Es el estereotipo que se encarga de dar de alta un bean para que implemente
	el patrón repositorio que es el encargado de almacenar y consultar datos en una BD o repo de datos.
	Al marcar el bean con esta anotación Spring aporta servicios transversales con conversión de tipos de 
	excepciones.
	(Es el que habla con las BDs, JSONs, etc. Se ocupa de la transición de datos)
	- @Service: Este estereotipo se encarga de gestionar las operaciones de negocio
	más importante a nivel de la aplicación y stackea y administra llamadas a varios componentes
	y repositorios de forma simultánea. Su tarea fundamental es la de agregado.
	- @Controller: Realiza las tareas de controlador y gestión de la comunicación
	entre el usuario y el afuera, o un aplicativo. Para ello se apoya habitualmente en algún motor 
	de templates o libraries o tags que facilitan el manejo del afuera.
	
	Repository, Service y Controller son hijos de Component.
	@RESTController: es hijo de @Controller, es lo mismo que decir @Controller y @ResponseBody.

	Inyección de dependencias (DI): Técnica o patrón de diseño utilizando como una de las 
	forma de inversión de control (IOC) para favoreces el bajo acoplamiento. Es decir,
	cuando una clase necesita de otra clase (dependencia), en lugar de crear el objeto dentro
	de la propia clase, Spring se lo suministra o inyecta. Esta forma de IOC
	sigue el prinicipio de Hollywood (no nos llames, nosotros te llamamos) en la que la
	aplicación es la que toma el control en lugar del código.
	Modularidad, escalabilidad, evita dependencias.

	Porgramación Orientada a Aspectos (AOP): Permite alta modularización para hacer una
	separación muy clara de las diferentes tareas que debe realizar cada clase de nuestra
	aplicación.

	Contenedor o Dispatcher: Spring mediante un contenedor (Servlet) o dispatcher, proporciona
	los objetos o Beans que se le va solicitando. Este utiliza un archivo de configuración que puede 
	ser definido de 3 formas diferentes:
	- XML, JSC (Java Source Code), JA (Java Annotations)

	Core de Spring:
	- Crea y gestiona Beans
	- Lee ficheros Config
	- Maneja propiedades y dependencias
	- Usa y administra el Stack de Beans
	- Administra el SEL (Spring Expression Language), para manipulizar objetos en tiempo de ejecución.

	Anotaciones Core:
	- @Required: Se aplica a los métodos de "setters" de Beans en un escenario.
	donde se necesita hacer cumplir una propiedad requerida. Esto me indica que el Bean
	afectado debe llenarse en el momento de la configuración con la propiedad requerida,
	sino se genera una exception de tipo "BeanInitializationException"
	- @Autowired: Se aplica a campos, métodos de "setters" y constructores. Inyecta la 
	dependencia del objeto implicitamente.
	Cuando se usa en los campos y se pasen los valores de los campos con el nombre de la propiedad,
	Spring asignará automáticamente los campos con los valores que se pasan.
	También se puede usar en propiedades privadas:
	Ej: public class User{
		@Autowired
		private String nombre;
		private int edad;
	}

	Cuando se utiliza en métodos "setter", Spring intenta realizarlo mediante Type
	autowiring en el método. Le está indicando a Spring que debe iniciar esta propiedad
	utilizando un método "setter" donde se puede agregar su código personalizado, como
	inicializar cualquier otra propiedad con esta propiedad.
	Ej. public class User {
		private String nombre;
		@Autowired
		public void setNombre (String nombre){
			this.nombre= nombre;
		}
	}
	Si se considera un escenario en el que se necesita una instancia de clase A, pero no
	almacena A en el campo de la clase, este simplemente usa A para obtener una instancia de B
	,y está almacenando B en este campo. En este caso, @Autowired automaticamente del método
	"setter" lo adapta mejor. No tendrá campos NO utilizados a nivel de clase.
	Cuando se usa @Autowired en un constructor, la inyección de constructor ocurre en el momento 
	de la creación del objeto, le dice al constructor que se conecte automaticamente
	cuando se usa como un Bean. Un constructor de una clase no Bean no puede utilizar
	@Autowired.
	
	Ej.
	@component
	public class User {
		private String nombre;
		@Autowired
		public User (String nombre){
			this. nombre = nombre;
		}
	}

	@Qualifier: Se usa junto a @Autowired. Cuando necesita más control de proceso de inyección de dependencia
	, se utiliza @Qualifier. Se puede especificar en argumentos de constructor individuales o 
	parametro de método. Evita a confusión que ocurre cuando crea más de un Bean del mismo tipo
	y se desea conectar solo uno de ellos con una propiedad.
	Ej.
	@Component
	public class Bean1 implements BeanInterface {
		//codigo
	}
	@Component
	public class Bean2 implements BeanInterface {
		// codigo
	}

	@public class BeanA {
		@Autowired
		@Qualifier ("bean2")
		private IBean dependencia;
	}

	Si BeanA automatiza la interfaz, Spring no sabe cual de las dos implementaciones inyectar.
	@Qualifier sirve para decirle desde donde inyectar

	Spring Rest
	@RequestMapping: Se puede utilizar a nivel clase o método. Asigna solicitudes web a
	clases de manejador (@controller) y métodos de manejador específicos.
	Usado a nivel de clase, crea una URI base para el que se usará el controlador.

	URI (Uniform Resource Identifier): String que identifica de manera univoca una red de recursos.
	@CookieValue: Se usa a nivel parámetro, como argumento de un método de mapeo de solicitud.
	La cookie HTTP está vinculada al parámetro @CookieValue para un nombre de cookie predeterminado.
	Se utiliza cuando existe una @RequestMapping.
	Ej. JSESSIONID=213452467HARCk
	Para obtener el valor de la cookie:
	@RequestMapping("/cookieValue")
		public void getCookieValue(@CookieValue "JSESSIONID String cookie"){
			acá va el código para trabajar la cookie
		}
	@PathVariable: Anota argumentos del método del controlador de solicitudes.
	@RequestMapping se puede usar para manejar cambios dinámicos de URI donde un cierto valor
	de URI actúa como parámetro. Puede específicar este parámetro cuando una expresión regular
	, y @PathVariable puede declarar este parámetro.


	*/


}
