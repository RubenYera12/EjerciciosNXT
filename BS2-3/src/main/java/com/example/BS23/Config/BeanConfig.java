package com.example.BS23.Config;

import com.example.BS23.Models.Person;
import com.example.BS23.Services.PersonService;
import com.example.BS23.Services.PersonServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

  @Bean("bean1")
  public Person getPersona() {
    PersonService personService = new PersonServiceImpl();
    personService.setName("bean1");
    personService.setAge(20);
    return personService.getPerson();
  }

  @Bean("bean2")
  public Person getPerson2() {
    PersonService personService = new PersonServiceImpl();
    personService.setName("bean2");
    personService.setAge(21);
    return personService.getPerson();
  }

  @Bean("bean3")
  public Person getPerson3() {
    PersonService personService = new PersonServiceImpl();
    personService.setName("bean3");
    personService.setAge(22);
    return personService.getPerson();
  }
}
