package com.example.BS12.Person.application;

import com.example.BS12.Person.infrastructure.dto.PersonInputDTO;
import com.example.BS12.Person.infrastructure.dto.PersonOutputDTO;

import java.util.List;

public interface PersonService {
  void addPerson(PersonInputDTO personInputDTO);

  List<PersonOutputDTO> findAll();

  PersonOutputDTO findOneByID(String id);

  void deleteByID(String id);

  void updatePerson(PersonInputDTO personInputDTO, String id);
}
