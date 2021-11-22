package com.springboot.fakespotify;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(FakespotifyApplication.class);
		
	/**
	 * properties--->
	 * spring.datasource.url = jdbc:mysql:http://localhost:8080/db
	 * spring.datasource.username = root
	 * spring.datasource.password = root
	 * spring.jpa.datasource.ddl-auto = update
	 */
	}

}
