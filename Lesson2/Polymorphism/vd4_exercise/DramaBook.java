package Lesson2.Polymorphism.vd4_exercise;

public class DramaBook extends Book{
    private String time;
    private String place;

    public DramaBook(String t, String a, int y, String time, String place){
        super(t,a,y);
        this.time=time;
        this.place=place;
    }

    public String getTime(){
        return time;
    }

    public String getPlace(){
        return place;
    }

    public void print(){
        super.print();
        System.out.println(getTime()+" "+getPlace());
    }
}
