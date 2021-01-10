package com.platzi.market;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication

//  extends SpringBootServletInitializer La extensión se utiliza para generar el war
public class PlatziMarketApplication  {

	// Este metodo se sobrescribe para generar el war
	//@Override
	//protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	//	return application.sources(PlatziMarketApplication.class);
	//}

	public static void main(String[] args) {
		SpringApplication.run(PlatziMarketApplication.class, args);
	}

}
