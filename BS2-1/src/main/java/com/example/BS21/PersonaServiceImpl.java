package com.example.BS21;

import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl implements PersonaService {

  Persona persona = new Persona();

  public String getNombre() {
    return persona.getNombre();
  }

  public int getEdad() {
    return persona.getEdad();
  }

  public void setNombre(String nombre) {
    persona.setNombre(nombre);
  }

  public void setEdad(int edad) {
    persona.setEdad(edad);
  }

  public Persona getPersona() {
    return persona;
  }
}
