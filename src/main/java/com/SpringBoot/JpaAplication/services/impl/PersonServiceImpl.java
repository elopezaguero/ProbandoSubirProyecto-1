package com.SpringBoot.JpaAplication.services.impl;

import com.SpringBoot.JpaAplication.entities.Person;
import com.SpringBoot.JpaAplication.repositories.IPersonRepository;
import com.SpringBoot.JpaAplication.services.IPersonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonServiceImpl implements IPersonServices {

    @Autowired
    private IPersonRepository personRepository;

    @Override
    public List<Person> getAllPersons() {
        return (List<Person>) personRepository.findAll();
    }

    @Override
    public Person findById(Long id) {
        Optional<Person> optionalPerson = personRepository.findById(id);
        Person person = optionalPerson.get();
        if(optionalPerson.isPresent()){
            return person;
        }else{
            return null;
        }
    }

    @Override
    public List<Person> findByfindByProgrammingLanguaje(String programmingLanguaje) {
        return personRepository.findByProgrammingLanguaje(programmingLanguaje);
    }

    @Override
    public Person crearPerson(Person person) {
        return personRepository.save(person);
    }
}
