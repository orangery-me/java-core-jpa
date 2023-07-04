
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    private String type;
    private Integer price;
    
    public Main() {
        this.type = "Cho HMong coc duoi";
        this.price = 1500;
    }
    
    public Main(String type, Integer price) {
        this.type = type;
        this.price = price;
    }
    

    @Override
    public String toString() {
        return "Main [type=" + type + ", price=" + price + "]";
    }

    public static void main(String[] args) throws Exception {
        Supplier <Main> sp= Main::new; // Constructor ko tham so
        Predicate <Main> pr= (a-> a.price>1400);
        System.out.println(pr.test(sp.get()));
    }
}
