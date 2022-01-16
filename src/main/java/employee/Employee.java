package employee;

public class Employee {
    String name;
    double age;
    double salary;
    Title title;
    Location location;

    Employee(String name, double age, double salary, Title title, Location location){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.title = title;
        this.location = location;
    }

    void raiseSalary(){
        if(this.title == Title.QA && salary <= 30.000){
            this.salary = salary + (salary * 1.2);
            System.out.println("The employee " + this.name+ "'s salary will raise as " + this.salary + " TL");
        }
    }
}
