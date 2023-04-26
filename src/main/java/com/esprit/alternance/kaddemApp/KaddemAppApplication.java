package com.esprit.alternance.kaddemApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
@EnableAspectJAutoProxy
public class KaddemAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(KaddemAppApplication.class, args);
	}

}
