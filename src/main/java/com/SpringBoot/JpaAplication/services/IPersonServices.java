package com.SpringBoot.JpaAplication.services;

import com.SpringBoot.JpaAplication.entities.Person;
import java.util.List;

public interface IPersonServices {
    List<Person> getAllPersons();
    Person findById(Long id);
    List<Person> findByfindByProgrammingLanguaje(String programmingLanguaje);
    Person crearPerson (Person person);
}
