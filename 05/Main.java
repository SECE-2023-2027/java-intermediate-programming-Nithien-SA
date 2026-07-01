import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Vehicle[] vehicles = new Vehicle[n];
        for (int i = 0; i < n; i++) {
            String type = sc.next();
            if (type.equalsIgnoreCase("Car")) {
                vehicles[i] = new Car();
            } else if (type.equalsIgnoreCase("Motorcycle")) {
                vehicles[i] = new Motorcycle();
            } else {
                vehicles[i] = new Vehicle();
            }
        }   
        for (Vehicle v : vehicles) {
            System.out.println(v.startEngine());
        }

        sc.close();
    }
}