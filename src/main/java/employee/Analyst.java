package employee;

public class Analyst extends Employee {

    public Analyst(String name, double salary, int age){
        super(name,salary,age);
    }

    public double getAnnualBonus(){
        return this.salary * .05;
    }

}
