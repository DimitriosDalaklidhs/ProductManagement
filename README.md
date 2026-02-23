# Product Management System

A simple Java console application for managing companies and their products, built to demonstrate IntelliJ IDEA workflow, Git/GitHub usage, and core OOP concepts.

---

## Purpose

The code itself is straightforward — the real goal of this project is to practice a real-world beginner development workflow:

- Confident use of IntelliJ IDEA (running, debugging, project structure)
- Proper package organization
- Git version control within IntelliJ
- Creating a repo, committing changes, and publishing to GitHub

---

## Features

- Add multiple companies, each with multiple products
- Input product details: name, code, and price
- Validate product codes in the format `AA123456` (two letters + six digits)
- Display product counts per company
- Find the most expensive product across all companies
- Search products by name (case-insensitive)

---

## Project Structure
```
ProductManagement/
└── src/
    └── Project/
        ├── Product.java
        ├── Company.java
        └── ProductManagement.java
```

---

## How to Run

**In IntelliJ IDEA:**
1. Open the project
2. Navigate to `src/Project/ProductManagement.java`
3. Click the Run button next to `main`

**In the terminal:**
```bash
# Compile
javac src/Project/*.java

# Run
java -cp src Project.ProductManagement
```

---

## Sample Output
```
=== PRODUCT MANAGEMENT SYSTEM ===
Type "exit" as company name to finish entering data.

Enter company name (or 'exit' to finish): Apple
Enter number of products for company "Apple": 2

--- Product 1 for Apple ---
Enter product name: iPhone
Enter product code (2 letters + 6 digits): IP123456
Enter product price: 1200

--- Product 2 for Apple ---
Enter product name: MacBook
Enter product code (2 letters + 6 digits): MC123456
Enter product price: 2000

Company "Apple" produces 2 products.

Enter company name (or 'exit' to finish): exit

Most expensive product overall:
  Company : Apple
  Product : MacBook
  Code    : MC123456
  Price   : $2000.00

=== PRODUCT SEARCH ===
Enter product name to search (or 'quit' to stop): quit
Exiting program. Goodbye!
```

---

## Tech Stack

- Java (JDK 24)
- IntelliJ IDEA
- Git & GitHub
