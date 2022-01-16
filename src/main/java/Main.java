import com.sun.xml.internal.ws.api.model.wsdl.editable.EditableWSDLModel;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Employee employeeJohn = new Employee("John", 30, 30.000, Title.QA, Location.ISTANBUL);
        Employee employeeKatie = new Employee("Katie", 32, 35.000, Title.QA, Location.ISTANBUL);

        System.out.println("John's Salary is " + employeeJohn.salary);
        System.out.println("Katie's Salary is " + employeeKatie.salary);


        employeeJohn.raiseSalary();
        employeeKatie.raiseSalary();
    }
}