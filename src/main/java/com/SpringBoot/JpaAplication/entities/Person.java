package com.SpringBoot.JpaAplication.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Persons")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String lastname;
    @Column(name = "programming_Languaje")
    private String programmingLanguaje;

    public void print(){
        System.out.println("Datos de la Persona:" +
                "\nId: " + this.id +
                "\nName: " + this.name +
                "\nLastName: " + this.lastname +
                "\nProgramming Languajes: " + this.programmingLanguaje);
        System.out.println("-----------------------------------------");
    }

}
