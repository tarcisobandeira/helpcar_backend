package com.sb.helpcar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = "com.sb.helpcar.entities")
@SpringBootApplication
public class HelpcarApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelpcarApplication.class, args);
	}

}
