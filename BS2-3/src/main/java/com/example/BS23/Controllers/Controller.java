package com.example.BS23.Controllers;

import com.example.BS23.Models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("controlador")
public class Controller {

    @Autowired
    @Qualifier("bean1")
    Person person1;

    @Autowired
    @Qualifier("bean2")
    Person person2;

    @Autowired
    @Qualifier("bean3")
    Person person3;

    @GetMapping("bean/{bean}")
    public Person getPersonBean(@PathVariable String bean){
        switch (bean){
            case "bean1" -> {
                return person1;
            }

            case "bean2" -> {
                return person2;
            }

            case "bean3" -> {
                return person3;
            }
            default -> {
                return new Person();
            }
        }

    }
}
