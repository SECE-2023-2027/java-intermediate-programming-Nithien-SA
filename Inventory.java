import java.util.Scanner;

class Product {
    private String productId;
    private String productName;
    private double price;
    private int stockQuantity;

    public Product(String productId, String productName, double price, int stockQuantity) {
        this.productId = productId;
        this.productName = productName;

        if (price < 0)
            this.price = 0.0;
        else
            this.price = price;

        if (stockQuantity < 0)
            this.stockQuantity = 0;
        else
            this.stockQuantity = stockQuantity;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(double price) {
        if (price < 0)
            this.price = 0.0;
        else
            this.price = price;
    }

    public void setStockQuantity(int stockQuantity) {
        if (stockQuantity < 0)
            this.stockQuantity = 0;
        else
            this.stockQuantity = stockQuantity;
    }

    public void applyDiscount(double percentage) {
        price = price - (price * percentage / 100);
    }
}

public class Inventory {
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