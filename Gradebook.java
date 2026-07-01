import java.util.Scanner;

class Student {
    private String name;
    private int[] marks;
    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    public double calculateAverage() {
        if (marks == null || marks.length == 0) {
            return 0.0;
        }

        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.length;
    }
}

public class Gradebook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int n = sc.nextInt();

        int[] marks = new int[n];
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }
        Student s = new Student(name, marks);
        System.out.println(s.calculateAverage());
        sc.close();
    }
}