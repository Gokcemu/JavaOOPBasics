import bankaccount.BankAccount;
import tree.Tree;
import tree.TreeType;

public class Main {
    public static void main(String[] args) {

        BankAccount bankAccountJohn = new BankAccount("John", 10.000 );

        bankAccountJohn.deposit(1000);
        bankAccountJohn.withDraw(250);
        bankAccountJohn.withDraw(1000);

        System.out.println("John's bank account balance is " + bankAccountJohn.getBalance());

        /*
        Tree myFavoriteMapleTree = new Tree(90, 30, TreeType.OAK);

        System.out.println(myFavoriteMapleTree.getHeightFt());
        System.out.println(myFavoriteMapleTree.getTrunkDiameterInches());
        System.out.println(myFavoriteMapleTree.getTreeType());


        /*employee.Employee employeeJohn = new employee.Employee("John", 30, 30.000, employee.Title.QA, employee.Location.ISTANBUL);
        employee.Employee employeeKatie = new employee.Employee("Katie", 32, 35.000, employee.Title.QA, employee.Location.ISTANBUL);

        System.out.println("John's Salary is " + employeeJohn.salary);
        System.out.println("Katie's Salary is " + employeeKatie.salary);


        employeeJohn.raiseSalary();
        employeeKatie.raiseSalary();*/
    }
}