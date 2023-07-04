import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List <String> ds= new ArrayList<String>();
        ds.add("C++");
        ds.add("Java");
        ds.add("Python");
        ds.add("Ruby");
        ds.add("Swift");
        ds.add("JavaScript");
        String a= ds.stream().min(String::compareTo).get();
        System.out.println(a);
    }
}
