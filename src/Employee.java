public abstract class Employee {

    Double ratePerHour;
    Integer workdays;

    Double getSalary(){
        double salary = ratePerHour * workdays * 8;
        return salary;
    }
}
