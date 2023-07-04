
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class Filter {
    public Predicate <Employee> adultFemale(){
        return p -> p.getAge()>20 && p.getGender().equals("F") ;
    }

    public Predicate <Employee> adultMale(){
        return p -> p.getAge()>21 && p.getGender().equals("M");
    }

    public List <Employee> filterEmployees(List <Employee> employesList, Predicate <Employee> select){
        return employesList.stream().filter(select).collect(Collectors.toList());
    }

    
}
