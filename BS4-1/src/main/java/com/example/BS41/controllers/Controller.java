package com.example.BS41.controllers;

import com.example.BS41.MyConfiguration;
import com.example.BS41.services.Perfil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

  @Autowired MyConfiguration myConfiguration;

  @Autowired private Perfil perfil;

  @Value("${spring.profiles.active}")
  private String profileValue;

  @Value("${url}")
  private String url;

  @Value("${password}")
  private String password;

  @GetMapping("/parametros")
  public String parametros() {
    return "Los parametros son url: " + url + " y password: " + password;
  }

  @GetMapping("/miconfiguracion")
  public String configuracion() {
    return "Mi configuracion es valor1: "
        + myConfiguration.getValor1()
        + ", valor2: "
        + myConfiguration.getValor2();
  }

  @GetMapping("/perfil")
  public String devuelvePerfil() {
    perfil.myFunction();
    return profileValue;
  }
}
