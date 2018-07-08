package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("com.example.modelDAO")
public class Testone1Application {
  
	public static void main(String[] args) {
		SpringApplication.run(Testone1Application.class, args);
	}
}
