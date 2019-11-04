public class Test2 {

    public static void main(String[] args) {
        Employee manager = new Manager(10.0, 20);
        Employee dev = new Developer(13.0, 20, 0.0);
        Employee sm = new ScrumMaster(12.0, 20);

        Company company = new MyCompany("MyCompany", 1000.0);
        company.addEmployee(manager);
        company.addEmployee(dev);
        company.addEmployee(sm);

        SalaryService salaryService = company.getSalaryService();
        salaryService.pay(company);
    }
}
