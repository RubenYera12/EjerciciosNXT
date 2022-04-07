package com.example.RS1.Controllers;

import com.example.RS1.Domain.Models.Person;
import com.example.RS1.Domain.Services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("person")
public class DeletePersonController {

  @Autowired PersonService personService;

  @DeleteMapping("{id}")
  public ResponseEntity<String> deletePerson(@PathVariable Integer id) {
    personService.removePerson(id);

    return ResponseEntity.ok("Eliminado");
  }
}
