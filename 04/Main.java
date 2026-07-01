import java.util.Scanner;

class Employee {
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double calculateSalary() {
        return baseSalary;
    }
}

class Manager extends Employee {
    private double bonus;

    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + bonus;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String empName = sc.nextLine();
        double empSalary = sc.nextDouble();
        sc.nextLine();
        String mgrName = sc.nextLine();
        double mgrSalary = sc.nextDouble();
        double bonus = sc.nextDouble();
        Employee emp = new Employee(empName, empSalary);
        Manager mgr = new Manager(mgrName, mgrSalary, bonus);
        System.out.println(emp.calculateSalary());
        System.out.println(mgr.calculateSalary());
        sc.close();
    }
}