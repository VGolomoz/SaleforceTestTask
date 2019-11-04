import java.util.List;

public abstract class Company {

    String name;
    Double budget;
    List<Employee> employees;

    void addEmployee(Employee employee){
        employees.add(employee);
    }

    SalaryService getSalaryService(){
        return new SalaryService();
    }


}
