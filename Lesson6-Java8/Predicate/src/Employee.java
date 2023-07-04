
import java.util.ArrayList;
import java.util.List;


public class Employee {
    private String name;
    private Integer age;
    private String gender;
    public Employee(Integer age,String gender,String name ) {

        this.gender = gender;
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    

    @Override
    public String toString() {
        return "Employee [name=" + name + ", age=" + age + ", gender=" + gender + "]";
    }
    public static String toString(List <Employee> e){
        StringBuilder sb= new StringBuilder();
        for (Employee employee : e) {
            sb.append(employee.toString()+"\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        List <Employee> employeesList= new ArrayList<Employee>();
        employeesList.add(0, new Employee(23, "M", "Beethovan"));
        employeesList.add(1, new Employee(27, "F", "Martina"));
        employeesList.add(2, new Employee(43, "M", "Ricky"));
        employeesList.add(3, new Employee(26, "M", "Jon"));
        employeesList.add(4, new Employee(19, "F", "Cristine"));
        employeesList.add(5, new Employee(15, "M", "David"));
        employeesList.add(6, new Employee(50, "F", "Melissa"));
        employeesList.add(7, new Employee(79, "M", "Alex"));
        employeesList.add(8, new Employee(18, "F", "Neetu"));
        employeesList.add(9, new Employee(45, "M", "Naveen"));
        Filter f= new Filter();
        System.out.println("Danh sach nhan vien nu tren 20 tuoi: \n");
        System.out.println(toString(f.filterEmployees(employeesList, f.adultFemale() ) ) );
        System.out.println("Danh sach nhan vien nam tren 21 tuoi: \n");
        System.out.println(toString( f.filterEmployees(employeesList, f.adultMale()) ) );

    }
        
}



