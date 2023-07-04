package Lesson2.Polymorphism.vd4_exercise;

public class PrintedBook {
    private String dimension;
    private String weight;

    public PrintedBook(String dim, String wei){
        dimension= dim;
        weight= wei;
    }
    public String getDimension(){
        return dimension;
    }
    public String getWeight(){
        return weight;
    }
}
