package com.example.BS22;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controlador2 {
  @Autowired CiudadService ciudadService;

  @GetMapping("/controlador1/getCiudad")
  public List<Ciudad> getCiudades() {
    return ciudadService.getAllCiudades();
  }
}
