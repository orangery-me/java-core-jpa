package Lesson2.Polymorphism.vd4_exercise;

public class Book {
    private String title;
    private String author; 
    private int yearOfPublication;

    public Book(String t, String a, int y){
        title= t;
        author= a;
        yearOfPublication= y;
    }

    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public int getYearOfPublication(){
        return yearOfPublication;
    }

    public void print(){
        System.out.println(getTitle()+" "+getAuthor()+" "+getYearOfPublication());
    }

}
