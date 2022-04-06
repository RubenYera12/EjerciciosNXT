package com.example.BS22;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador1 {

  @Autowired CiudadService ciudadService;

  @PostMapping("/controlador1/addCiudad")
  public void addCiudad(@RequestBody Ciudad ciudad) {
    ciudadService.addCiudad(ciudad);
  }
}
