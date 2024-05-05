package com.SpringBoot.JpaAplication.controllers;

import com.SpringBoot.JpaAplication.entities.Person;
import com.SpringBoot.JpaAplication.services.IPersonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/person")
public class PersonControler {

    @Autowired
    IPersonServices ipersonServices;

    @GetMapping("/find/{id}")
    public ResponseEntity<Person> findByIdController(@PathVariable Long id){
        Person person = ipersonServices.findById(id);
        return ResponseEntity.ok(person);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Person>> findByAllController(){
        List<Person> person = ipersonServices.getAllPersons();
        return ResponseEntity.ok(person);
    }

    @GetMapping("/findLP/{programmingLanguaje}")
    public ResponseEntity<List<Person>> findByfindByProgrammingLanguajeController(@PathVariable String programmingLanguaje){
        List<Person> person = ipersonServices.findByfindByProgrammingLanguaje(programmingLanguaje);
        return ResponseEntity.ok(person);
    }

    @PostMapping("/save")
    public ResponseEntity<Person> createPersonController(@RequestBody Person entity){
        Person person = ipersonServices.crearPerson(entity);
        return ResponseEntity.ok(person);
    }
}
