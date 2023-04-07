package com.demo.tienda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication (exclude = DataSourceAutoConfiguration.class)
public class DemoTiendaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoTiendaApplication.class, args);
	}

}
