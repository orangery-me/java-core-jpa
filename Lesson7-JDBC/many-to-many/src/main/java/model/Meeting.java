package model;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Meeting {
    @Id     @GeneratedValue
    private int meetID;
    private LocalDate date;
    private String place;

    @ManyToMany (cascade = CascadeType.ALL)
    @JoinTable(name="meeting_employee",
    joinColumns = {@JoinColumn(name ="meetingID")},
    inverseJoinColumns = {@JoinColumn(name="employeeID")})
    private Set<Employee> employees= new HashSet<Employee>();
    
    public Meeting(int meetID, LocalDate date, String place) {
        this.meetID = meetID;
        this.date = date;
        this.place = place;
    }
    public Meeting(LocalDate date, String place) {
        this.date = date;
        this.place = place;
    }
    public int getMeetID() {
        return meetID;
    }
    public void setMeetID(int meetID) {
        this.meetID = meetID;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public String getPlace() {
        return place;
    }
    public void setPlace(String place) {
        this.place = place;
    }
    public Set<Employee> getEmployees() {
        return employees;
    }
    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }
    public void add(Employee e){
        this.employees.add(e);
    }
    
}
