package com.example.BS22;

import java.util.ArrayList;
import java.util.List;

public class CiudadServiceImpl implements CiudadService {

  List<Ciudad> listaCiudades = new ArrayList<>();

  @Override
  public void addCiudad(Ciudad ciudad) {
    listaCiudades.add(ciudad);
  }

  @Override
  public List<Ciudad> getAllCiudades() {
    return this.listaCiudades;
  }
}
