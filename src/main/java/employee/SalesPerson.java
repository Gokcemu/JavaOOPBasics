package employee;

public class SalesPerson extends Employee {
    private String name;
    private double salary;
    private int age;
    private double comissionPercentage;

    public SalesPerson(String name, double salary, int age, double comissionPercentage){
        super(name,salary,age);
        this.comissionPercentage = comissionPercentage;
    }


    public double getComissionPercentage(){
     return this.comissionPercentage;
    }


    public void raiseComission(){
        if (this.comissionPercentage < .30){
            this.comissionPercentage = this.comissionPercentage * 1.2;
        }
    }

}
