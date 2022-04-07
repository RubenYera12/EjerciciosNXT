package com.example.BS23.Services;

import com.example.BS23.Models.Person;

public interface PersonService {

  String getName();
  int getAge();
  void setName(String name);
  void setAge(int age);
  Person getPerson();
}
