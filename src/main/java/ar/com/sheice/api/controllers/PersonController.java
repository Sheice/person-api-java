package ar.com.sheice.api.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @PostMapping
    public Person savePerson(@RequestBody Person person){
        return personService.savePerson(person);
    }

    @GetMapping("/{id}")
    public Optional<Person> getOnePerson(@PathVariable Long id){
        return personService.getOnePerson(id);
    }

}
