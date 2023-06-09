package com.ileadconsultiong.projectCoding;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
@EnableConfigServer
public class ProjectCodingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectCodingApplication.class, args);
	}

}
