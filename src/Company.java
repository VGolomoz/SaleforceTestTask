import java.util.ArrayList;
import java.util.List;

public abstract class Company {

    private String name;
    private Double budget;
    private List<Employee> employees;

    public Company(String name, Double budget) {
        this.name = name;
        this.budget = budget;
        this.employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBudget() {
        return budget;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public SalaryService getSalaryService(){
        return new SalaryService();
    }


}
