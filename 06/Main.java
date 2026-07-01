import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Circle
        double radius = sc.nextDouble();

        // Rectangle
        double length = sc.nextDouble();
        double width = sc.nextDouble();

        // Square
        int side = sc.nextInt();

        System.out.println(AreaCalculator.calculateArea(radius));
        System.out.println(AreaCalculator.calculateArea(length, width));
        System.out.println(AreaCalculator.calculateArea(side));

        sc.close();
    }
}