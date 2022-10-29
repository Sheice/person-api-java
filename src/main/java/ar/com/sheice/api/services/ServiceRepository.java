package ar.com.sheice.api.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.sheice.api.models.Person;
import ar.com.sheice.api.repositories.PersonRepository;

@Service
public class ServiceRepository {
    
    @Autowired
    private PersonRepository personRepository;

    public ArrayList<Person> getAllPersons(){
        return (ArrayList<Person>)personRepository.findAll();
    }

}
