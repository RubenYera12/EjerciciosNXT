package com.example.BS21;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class Controlador1 {

    @Autowired
    PersonaService personaService;

    @GetMapping("/controlador1/{nombre}/{edad}")
    public void setPersona(@PathVariable String nombre,@PathVariable int edad){
        personaService.setNombre(nombre);
        personaService.setEdad(edad);
    }
}
