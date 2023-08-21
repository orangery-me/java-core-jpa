package model;

import java.time.LocalDate;

import javax.persistence.Entity;

@Entity
public class Teacher extends People{
    private String field;
    public Teacher(){}
    public Teacher(String id, String name, LocalDate dob, String field) {
        super(id, name, dob);
        this.field = field;
    }
    public Teacher(String field) {
        this.field = field;
    }
    public String getField() {
        return field;
    }
    public void setField(String field) {
        this.field = field;
    };
    
}
