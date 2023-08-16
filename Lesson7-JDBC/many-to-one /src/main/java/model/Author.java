package model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Author {
    @Id @GeneratedValue
    private int authorID;
    private String name;
    private LocalDate dob;
    private String coutry;
    public Author(){};
    public Author(int authorID, String name, LocalDate dob, String coutry) {
        this.authorID = authorID;
        this.name = name;
        this.dob = dob;
        this.coutry = coutry;
    }
    public Author(String name, LocalDate dob, String coutry) {
        this.name = name;
        this.dob = dob;
        this.coutry = coutry;
    }
    public int getAuthorID() {
        return authorID;
    }
    public void setAuthorID(int authorID) {
        this.authorID = authorID;
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
    public String getCoutry() {
        return coutry;
    }
    public void setCoutry(String coutry) {
        this.coutry = coutry;
    }
    @Override
    public String toString() {
        return "Author [authorID=" + authorID + ", name=" + name + ", dob=" + dob + ", coutry=" + coutry + "]";
    }
    
}
