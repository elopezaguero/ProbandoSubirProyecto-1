package com.SpringBoot.JpaAplication;

import com.SpringBoot.JpaAplication.entities.Person;
import com.SpringBoot.JpaAplication.services.IPersonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;

import java.util.List;

@SpringBootApplication
public class JpaAplicationApplication implements CommandLineRunner {

	@Autowired
	private IPersonServices repository;
	public static void main(String[] args) {
		SpringApplication.run(JpaAplicationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//List<Person> persons = (List<Person>) repository.getAllPersons();
		//List<Person> persons = (List<Person>) repository.findByfindByProgrammingLanguaje(".Net");
    	//persons.stream().forEach(p -> person.print());

		Person person = repository.findById(2L);
		person.print();
	}
}
