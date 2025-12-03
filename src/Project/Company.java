package Project;

import java.util.ArrayList;

public class Company {

    private String companyName;
    private ArrayList<Product> products;

    // No-argument constructor
    public Company() {
        this.companyName = "";
        this.products = new ArrayList<>();
    }

    // Constructor with arguments
    public Company(String companyName, ArrayList<Product> products) {
        this.companyName = companyName;
        this.products = products;
    }

    // Getter for company name
    public String getCompanyName() {
        return companyName;
    }

    // Setter for company name
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    // Getter for products list
    public ArrayList<Product> getProducts() {
        return products;
    }

    // Setter for products list
    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    // Return number of products
    public int getNumOfProducts() {
        return products.size();
    }

    // Add a product to the list
    public void addProduct(Product p) {
        products.add(p);
    }

    // toString
    @Override
    public String toString() {
        return "Company{name='" + companyName + "', products=" + products + "}";
    }
}
