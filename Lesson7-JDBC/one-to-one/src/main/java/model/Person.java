package model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Person {

    @Id  @GeneratedValue
    public int id;
    public String name;
    public LocalDate dob;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="spouse_id")
    public Person spouse;

    public Person(){}

    public Person(int id, String name, LocalDate dob, Person spouse) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.spouse = spouse;
    }
    public Person(String name, LocalDate dob, Person spouse) {
        this.name = name;
        this.dob = dob;
        this.spouse = spouse;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Person getSpouse() {
        return spouse;
    }

    public void setSpouse(Person spouse) {
        this.spouse = spouse;
    };
    
    
}
