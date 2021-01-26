package com.utour;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 *
 */
@EnableWebMvc
@SpringBootApplication
@EntityScan(basePackageClasses = Application.class)
public class Application {

	/**
	 * spring-application run(type servlet)
	 * @param args
	 */
	public static void main(String args[]) {
		new SpringApplicationBuilder(Application.class)
			.web(WebApplicationType.SERVLET)
			.run(args);
	}
}
