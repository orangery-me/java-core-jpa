import java.util.Optional;

class Person{
    String name;
}

public class App {
    static Person getPerson(String name){
        Person t= new Person();
        t.name= name;
        return t;
    }
    public static void main(String[] args) throws Exception {
        Person st1= getPerson("Chau Thi");
        Optional<Person> opt= Optional.of(st1);
        if (opt.isPresent()){
            System.out.println(opt.get().name);
        }

    }
}
