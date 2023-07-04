
import java.util.function.Predicate;

public class App {

    public static boolean Test(String a){
        return a.equals("Hong Thanh");
    }

    public static void in1(String a, Predicate<String> b){
        System.out.println(b.test(a));
    }

    public static void in2(String a, Predicate<String> b){
        System.out.println(b.test(a));
    }

    public static void main(String[] args) throws Exception {

        // c1: lambda expression
        Predicate <String> pre = (a-> a.equals("Chau Thi"));
        Predicate <String> preAnd= pre.and(a-> a.length()==10);
        Predicate <String> preOr= preAnd.or(a-> a.isEmpty());
        System.out.println(preOr.test("Chau Thi")); 
        
        // c2: Method references
        in1("Chau Thi", App::Test);

        // c3: Anonymous class
        String a= new String("Hong Thao");
        in2(a,new Predicate<String>() {
            public boolean test(String a){
                return a.equals("Hong Thao");
            }
        });
    
    }
}
