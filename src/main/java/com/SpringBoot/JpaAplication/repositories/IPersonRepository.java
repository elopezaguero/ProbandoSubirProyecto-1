package com.SpringBoot.JpaAplication.repositories;

import com.SpringBoot.JpaAplication.entities.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface IPersonRepository extends CrudRepository<Person, Long> {
    List<Person> findByProgrammingLanguaje(String programmingLanguaje);

}
