package Project;

import java.util.Scanner;

public class Product {

    // Fields
    private double price;
    private String name;
    private String code;  // 2 letters + 6 digits

    // No-argument constructor
    public Product() {
        this.price = 0.0;
        this.name = "";
        this.code = "";
    }

    // Constructor with arguments
    public Product(String name, String code, double price) {
        this.name = name;
        this.code = code;
        this.price = price;
    }

    // Getters
    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    // Setters
    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    // toString()
    @Override
    public String toString() {
        return "Product{name='" + name + "', code='" + code + "', price=" + price + "}";
    }

    // readProduct() method (reads keyboard input)
    public void readProduct() {
        Scanner sc = new Scanner(System.in);

        // Read name
        do {
            System.out.print("Enter product name: ");
            name = sc.nextLine().trim();
        } while (name.isEmpty());

        // Read code (must be 2 letters + 6 digits)
        boolean validCode = false;
        while (!validCode) {
            System.out.print("Enter product code (2 letters + 6 digits): ");
            code = sc.nextLine().trim();
            validCode = code.matches("[A-Za-z]{2}[0-9]{6}");
            if (!validCode) {
                System.out.println("Invalid code format. Try again.");
            }
        }

        // Read price (must be non-negative)
        do {
            System.out.print("Enter product price: ");
            while (!sc.hasNextDouble()) {
                System.out.println("Invalid price. Enter a number.");
                sc.next();
            }
            price = sc.nextDouble();
            sc.nextLine(); // clear buffer
        } while (price < 0);
    }

    // compare() method: returns true if this product is more expensive than p
    public boolean compare(Product p) {
        return this.price > p.price;
    }
}
