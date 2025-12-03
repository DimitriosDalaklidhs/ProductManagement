package Project;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Company> companies = new ArrayList<>();

        System.out.println("=== PRODUCT MANAGEMENT SYSTEM ===");
        System.out.println("Type \"exit\" as company name to finish entering data.\n");

        while (true) {
            // ----- Read company name -----
            String companyName;

            while (true) {
                System.out.print("Enter company name (or 'exit' to finish): ");
                companyName = sc.nextLine().trim();

                if (companyName.equalsIgnoreCase("exit")) {
                    break;  // exit outer loop after we finish checks
                }

                if (companyName.isEmpty()) {
                    System.out.println("Company name cannot be empty. Try again.");
                } else {
                    break;
                }
            }

            if (companyName.equalsIgnoreCase("exit")) {
                break;  // stop creating companies
            }

            // ----- Read number of products for this company -----
            int numProducts = 0;
            while (true) {
                System.out.print("Enter number of products for company \"" + companyName + "\": ");
                if (sc.hasNextInt()) {
                    numProducts = sc.nextInt();
                    sc.nextLine(); // clear buffer

                    if (numProducts < 0) {
                        System.out.println("Number of products cannot be negative. Try again.");
                    } else {
                        break;
                    }
                } else {
                    System.out.println("Please enter a valid integer.");
                    sc.nextLine(); // discard invalid input
                }
            }

            ArrayList<Product> products = new ArrayList<>();

            // ----- Read each product -----
            for (int i = 0; i < numProducts; i++) {
                System.out.println("\n--- Product " + (i + 1) + " for company " + companyName + " ---");
                Product p = new Product();
                p.readProduct();    // handles validation inside
                products.add(p);
            }

            // Create Company object and add to list
            Company company = new Company(companyName, products);
            companies.add(company);

            // 3. Message about number of products for this company
            System.out.println("\nCompany \"" + company.getCompanyName() + "\" produces "
                    + company.getNumOfProducts() + " products.\n");
        }

        // ----- 4. Find most expensive product among ALL companies -----
        Product mostExpensive = null;
        Company ownerCompany = null;

        for (Company c : companies) {
            for (Product p : c.getProducts()) {
                if (mostExpensive == null || p.getPrice() > mostExpensive.getPrice()) {
                    mostExpensive = p;
                    ownerCompany = c;
                }
            }
        }

        if (mostExpensive != null) {
            System.out.println("Most expensive product overall:");
            System.out.println("Company   : " + ownerCompany.getCompanyName());
            System.out.println("Product   : " + mostExpensive.getName());
            System.out.println("Code      : " + mostExpensive.getCode());
            System.out.println("Price     : " + mostExpensive.getPrice());
            System.out.println();
        } else {
            System.out.println("No products were entered.");
        }

        // ----- 5. Search loop -----
        System.out.println("\n=== PRODUCT SEARCH ===");
        System.out.println("Type product names to search. Type \"quit\" to stop.");

        while (true) {
            System.out.print("Enter product name to search (or 'quit' to stop): ");
            String name = sc.nextLine().trim();

            if (name.equalsIgnoreCase("quit")) {
                break;
            }

            if (name.isEmpty()) {
                System.out.println("Name cannot be empty. Try again.");
                continue;
            }

            boolean found = search(companies, name);

            if (found) {
                System.out.println("Product \"" + name + "\" exists in the system.");
            } else {
                System.out.println("Product \"" + name + "\" was NOT found.");
            }
        }

        System.out.println("Exiting program. Goodbye!");
        sc.close();
    }

    /**
     * Search method:
     * returns true if a product with the given name exists among
     * all products of all companies.
     */
    public static boolean search(ArrayList<Company> al, String name) {
        for (Company c : al) {
            for (Product p : c.getProducts()) {
                if (p.getName().equalsIgnoreCase(name)) {
                    return true;
                }
            }
        }
        return false;
    }
}
