import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Language {
    private String name;
    private Integer year;
    
    public Language(String name, Integer year) {
        this.name = name;
        this.year = year;
    }
    
    @Override
    public String toString() {
        return "Language [name=" + name + ", year=" + year + "]";
    }

    public static void print(Language l){

        System.out.println(l.name+" "+l.year);

    }
    public static void main(String[] args) throws Exception {
        List <Language> ls= new ArrayList<Language>();
        ls.add(0, new Language("C++", 1985));
        ls.add(1, new Language("Java", 1995));
        ls.add(2, new Language("Kotlin", 2011));
        ls.add(3, new Language("Swift", 2019));

        // using Consumer
        System.out.println("\nc0: using Consumer\n");
        Consumer <Language> c= (a ->System.out.println(a.toString()));
        ls.forEach(c);

        // lambda expression
        System.out.println("\nc1: lambda expression\n");
        ls.forEach(a-> System.out.println(a.name+" "+a.year));

        // method references
        System.out.println("\nc2: method references\n");
        ls.forEach(Language::print);
    }

}
