package ar.com.sheice.api.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.sheice.api.models.Person;
import ar.com.sheice.api.services.PersonService;

@RestController
@RequestMapping("/api/person")
public class PersonController {
    
    @Autowired
    private PersonService personService;

    @GetMapping("/all")
    public ArrayList<Person> getAllPerson(){
        return personService.getAllPersons();
    }

}
