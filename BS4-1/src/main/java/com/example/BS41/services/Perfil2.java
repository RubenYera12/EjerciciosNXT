package com.example.BS41.services;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("perfil2")
@Data
public class Perfil2 implements Perfil {

  @Value("${perfil}")
  @Override
  public void myFunction() {
    System.out.println("Perfil2");
  }
}
