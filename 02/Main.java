import java.util.Scanner;

public class Main {
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