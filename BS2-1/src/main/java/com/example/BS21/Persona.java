package com.example.BS21;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
public class Persona {
  private String nombre;
  private int edad;

  public Persona() {}
}
