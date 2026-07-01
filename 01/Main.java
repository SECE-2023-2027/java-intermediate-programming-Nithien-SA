import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String productId = sc.nextLine();
        String productName = sc.nextLine();
        double price = sc.nextDouble();
        int stockQuantity = sc.nextInt();
        double discount = sc.nextDouble();
        Product p = new Product(productId, productName, price, stockQuantity);
        p.applyDiscount(discount);
        System.out.println(p.getPrice());
        System.out.println(p.getStockQuantity());

        sc.close();
    }
}