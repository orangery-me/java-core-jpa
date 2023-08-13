package model;


import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cat {
    private Integer id;
    private String name;
    private Date dob;
    private Boolean gender;
    public Cat(){}
    public Cat(Integer id, String name, Date dob, Boolean gender) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.gender = gender;
    }

    @Id     // khoa chinh        
    @GeneratedValue     // auto_increase
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }
    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Boolean getGender() {
        return gender;
    }
    public void setGender(Boolean gender) {
        this.gender = gender;
    }
    @Override
    public String toString() {
        return "Cat [id=" + id + ", name=" + name + ", dob=" + dob + ", gender=" + gender + "]";
    };

    
}
