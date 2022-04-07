package com.example.RS1.Controllers;

import com.example.RS1.Domain.Models.Person;
import com.example.RS1.Domain.Services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("person")
public class AddPersonController {

  @Autowired PersonService personService;

  @PostMapping()
  public ResponseEntity<List> addPersona(@RequestBody Person person) {
    personService.getPersonList().add(person);

    return ResponseEntity.ok(personService.getPersonList());
  }
}
