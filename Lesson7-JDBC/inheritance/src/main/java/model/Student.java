package model;

import java.time.LocalDate;

import javax.persistence.Entity;

@Entity
public class Student extends People{
    private Double gpa;
    public Student(){};
    public Student(String id, String name, LocalDate dob, Double gpa) {
        super(id, name, dob);
        this.gpa = gpa;
    }

    public Student(Double gpa) {
        this.gpa = gpa;
    }
    public Double getGpa() {
        return gpa;
    }
    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }
    
}
