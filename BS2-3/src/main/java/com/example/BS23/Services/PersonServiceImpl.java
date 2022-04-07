package com.example.BS23.Services;

import com.example.BS23.Models.Person;

public class PersonServiceImpl implements PersonService {

  Person person = new Person();

  @Override
  public String getName() {
    return person.getName();
  }

  @Override
  public int getAge() {
    return person.getAge();
  }

  @Override
  public void setName(String name) {
    person.setName(name);
  }

  @Override
  public void setAge(int age) {
    person.setAge(age);
  }

  @Override
  public Person getPerson() {
    return person;
  }
}
