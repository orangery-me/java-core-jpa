package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Book {
    @Id 
    private String bookid;
    private String title;

    @ManyToOne   //@JoinColumn(name="Author ID")
    private Author author;
    private Double price;
    
    public Book(String bookid, String title, Author author, Double price) {
        this.bookid = bookid;
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public String getBookid() {
        return bookid;
    }
    public void setBookid(String bookid) {
        this.bookid = bookid;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public Author getAuthor() {
        return author;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }
    
}
