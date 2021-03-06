package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController()
public class Controller {

  @GetMapping("/user/{nombre}")
  public String gethHola(@PathVariable String nombre) {
    return "Hola " + nombre;
  }

  @PostMapping("/useradd")
  public ResponseEntity<Persona> addPersona(@RequestBody Persona persona) {
    persona.setEdad(persona.getEdad()+1);
    return ResponseEntity.ok(persona);
  }
}
