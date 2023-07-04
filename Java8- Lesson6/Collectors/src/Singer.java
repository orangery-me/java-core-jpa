import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Singer {

    private String name;
    private Integer awards;
    private String country;

    public Singer(String name, Integer awards, String country) {
        this.name = name;
        this.awards = awards;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAwards() {
        return awards;
    }

    public void setAwards(Integer awards) {
        this.awards = awards;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    
    @Override
    public String toString() {
        return "Singer [name=" + name + ", awards=" + awards + ", country=" + country + "]";
    }

    public static void main(String[] args) throws Exception {
        List <Singer> list= Arrays.asList(
            new Singer("Dong Nhi",6,"VN"),
            new Singer("Hoang Thuy Linh",7,"VN"),
            new Singer("Adele",11,"UK"),
            new Singer("My Tam",12,"VN"),
            new Singer("Ed Sheeran",3,"UK"),
            new Singer("Taylor Swift",16,"US")
        );        

        Map <String, Integer> m= list.stream().collect(Collectors.toMap(Singer::getName, Singer::getAwards, (a,b)-> (a>b? a:b), LinkedHashMap::new));        
        System.out.println(m.toString());


        System.out.println("There are "+list.stream().collect(Collectors.counting())+" singers\n");


        Map<String, Set<Singer>> m1  =list.stream().collect(Collectors.groupingBy(Singer::getCountry, Collectors.toSet()));
        // group.entrySet().stream().forEach(r -> System.out.println(r.getKey() + ": "+ r.getValue() ));
        m1.forEach((country,singerList)->System.out.println(country+"\n"+singerList.toString()));

        System.out.println("\n Singers who have over 10 awards:\n");
        Predicate <Singer> pre= a ->a.awards>10;
        Map<Boolean, Set<Singer>> m2= list.stream().collect(Collectors.partitioningBy(pre, Collectors.toSet()));
        m2.forEach((bool,singerList) -> System.out.println(bool+"\n"+singerList.toString()));
    }
}
