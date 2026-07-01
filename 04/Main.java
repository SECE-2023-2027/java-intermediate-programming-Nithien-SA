import java.util.Scanner;

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