import com.sun.xml.internal.ws.api.model.wsdl.editable.EditableWSDLModel;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Employee employeeJohn = new Employee("John", 30, 30.000, Title.QA, Location.ISTANBUL);
        Employee employeeKatie = new Employee("Katie", 32, 35.000, Title.QA, Location.ISTANBUL);

        employeeJohn.raiseSalary();
        employeeKatie.raiseSalary();
    }
}