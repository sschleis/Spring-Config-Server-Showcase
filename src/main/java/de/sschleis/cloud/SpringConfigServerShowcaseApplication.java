package de.sschleis.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringConfigServerShowcaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringConfigServerShowcaseApplication.class, args);
	}
}
