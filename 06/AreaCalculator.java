public class AreaCalculator {

    // Circle
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Rectangle
    public static double calculateArea(double length, double width) {
        return length * width;
    }

    // Square
    public static double calculateArea(int side) {
        return side * side;
    }
} 
