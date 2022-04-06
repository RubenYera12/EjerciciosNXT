package com.example.BS22;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Bs22Application {

  public static void main(String[] args) {
    SpringApplication.run(Bs22Application.class, args);
  }

  @Bean
  CiudadService getCiudadService() {
    CiudadService c = new CiudadServiceImpl();
    System.out.println("hola");
    return c;
  }
}
