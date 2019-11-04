import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class SalaryService {

    public void pay(Company company){

        Double totalSalary = 0.0;
        for (Employee e: company.getEmployees()) {
            totalSalary += e.getSalary();
        }

       String result = (totalSalary < company.getBudget()) ? "You have enough money" : "You have NOT enough money";
       System.out.println(result);
    }
}
