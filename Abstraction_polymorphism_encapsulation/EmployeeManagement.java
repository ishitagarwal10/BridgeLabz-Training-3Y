abstract class Employee{
    int id;
    String name;
    double salary;

    //constructor
    Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    //abstract method
    abstract double calculateSalary();
}

class Manager extends Employee{
    double bonus;
    Manager(int id, String name, double salary, double bonus){
        super(id, name, salary);
        this.bonus = bonus;
    }

    @Override
    double calculateSalary(){
        return salary + bonus;
    }
}

class Developer extends Employee{
    int projects;
    double payPerProjects;
    Developer(int id, String name, double salary, int projects, double payPerProjects){
        super(id, name, salary);
        this.projects = projects;
        this.payPerProjects = payPerProjects;
    }

    @Override
    double calculateSalary(){
        return salary + (projects * payPerProjects);
    }
}

class Intern extends Employee{
    double stipend;
    Intern(int id, String name, double salary, double stipend){
        super(id, name, salary);
        this.stipend = stipend;
    }

    @Override
    double calculateSalary(){
        return stipend;
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        Manager m = new Manager(1, "Kunj", 60000, 5000);
        Developer d = new Developer(2, "Parul", 50000, 3, 2000);
        Intern i = new Intern(3, "Ishita", 0, 8000);

        System.out.println("Manager's Salary" + m.calculateSalary());
        System.out.println("Developer's Salary" + d.calculateSalary());
        System.out.println("Intern's Salary" + i.calculateSalary());
    }
}