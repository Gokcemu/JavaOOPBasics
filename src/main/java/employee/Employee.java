package employee;

public class Employee {
    private String name;
    protected double salary;
    private int age;
    Title title;
    Location location;

    public Employee(String name, int age, double salary, Title title, Location location){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.title = title;
        this.location = location;
    }

    public Employee(String name, double salary, int age) {
        this.name = name;
        this.age = age;
        this.salary = salary;

    }

    public String getName() {
        return this.name;
    }

    public double getSalary() {
        return this.salary;
    }

    public int getAge() {
        return this.age;
    }

    public void raiseSalary(){
        this.salary = this.salary * 1.2;
    }
}
