package com.example.BS21;

import org.springframework.beans.factory.annotation.Autowired;

public interface PersonaService {
    String getNombre();
    int getEdad();
    void setNombre(String nombre);
    void setEdad(int edad);

    Persona getPersona();
}
