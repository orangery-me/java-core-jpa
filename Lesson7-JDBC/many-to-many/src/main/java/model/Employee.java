package model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Employee {
    @Id     @GeneratedValue
    private int emID;
    private String name;
    private String email;

    @ManyToMany(mappedBy = "employees")
    private Set<Meeting> meetings= new HashSet<Meeting>();

    public Employee(){}
    public Employee(int emID, String name, String email) {
        this.emID = emID;
        this.name = name;
        this.email = email;
    }
    public Employee(String name, String email) {
        this.name = name;
        this.email = email;
    }
    public int getEmID() {
        return emID;
    }
    public void setEmID(int emID) {
        this.emID = emID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Set<Meeting> getMeetings() {
        return meetings;
    }
    public void setMeetings(Set<Meeting> meetings) {
        this.meetings = meetings;
    }
    public void add(Meeting m){
        this.meetings.add(m);
    }
    
}
