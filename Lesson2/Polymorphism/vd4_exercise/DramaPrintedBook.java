package Lesson2.Polymorphism.vd4_exercise;

public class DramaPrintedBook extends DramaBook {
    private String dimension;
    private String weight;

    public DramaPrintedBook(String t, String a, int y, String time, String place, String dim, String wei){
        super(t, a, y, time, place);
        dimension= dim;
        weight= wei;
    }
    public String getDimension(){
        return dimension;
    }
    public String getWeight(){
        return weight;
    }
    public void print(){
        super.print();
        System.out.println(getDimension()+" "+getWeight());
    }
}
