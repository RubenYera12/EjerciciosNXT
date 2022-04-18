package com.example.EJ2crud.Person.infrastructure.dto;

import com.example.EJ2crud.Person.domain.Person;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class PersonInputDTO {
  private Integer person_id;

  private String user;
  private String password;
  private String name;
  private String surname;
  private String company_email;
  private String personal_email;
  private String city;
  private boolean active;
  private Date created_date;
  private String image_url;
  private Date termination_date;

  public PersonInputDTO(Person person) {
    setPerson_id(person.getPerson_id());
    setActive(person.isActive());
    setCity(person.getCity());
    setCompany_email(person.getCompany_email());
    setImage_url(person.getImage_url());
    setName(person.getName());
    setSurname(person.getSurname());
    setPassword(person.getPassword());
    setPersonal_email(person.getPersonal_email());
    setUser(person.getUser());
    setTermination_date(person.getTermination_date());
  }

  public PersonInputDTO() {}
}
