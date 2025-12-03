ProductManagement












 Project Purpose

Although this repository contains a basic Java application, its primary purpose is to showcase:

Confident use of IntelliJ IDEA

Proper project structuring and package organization

Running, testing, and debugging inside the IDE

Setting up Git version control within IntelliJ

Creating a local repository, connecting it to GitHub, committing changes, and publishing the project directly from the IDE

The project is therefore designed to reflect real-world IDE workflow experience rather than present a large or advanced Java system.

✨ Features

Add multiple companies, each with several products

Input product details (name, code, price)

Validate product codes (AA123456 format: 2 letters + 6 digits)

Identify the most expensive product across all companies

Search for products by name (case-insensitive)

Fully console-based and simple to run

📁 Project Structure
ProductManagement/
└── src/
    └── Project/
        ├── Product.java
        ├── Company.java
        └── ProductManagement.java

▶️ How to Run
Running in IntelliJ IDEA

Open the project in IntelliJ IDEA

Navigate to:
src/Project/ProductManagement.java

Run the main method using the green Run button

Running in Terminal
javac src/Project/*.java
java -cp src Project.ProductManagement

 Sample Program Output
=== PRODUCT MANAGEMENT SYSTEM ===
Type "exit" as company name to finish entering data.

Enter company name (or 'exit' to finish): Apple
Enter number of products for company "Apple": 2

--- Product 1 for company Apple ---
Enter product name: iPhone
Enter product code (2 letters + 6 digits): IP123456
Enter product price: 1200

--- Product 2 for company Apple ---
Enter product name: MacBook
Enter product code (2 letters + 6 digits): MC123456
Enter product price: 2000

Company "Apple" produces 2 products.

Enter company name (or 'exit' to finish): exit

Most expensive product overall:
Company : Apple
Product : MacBook
Code    : MC123456
Price   : 2000.0

=== PRODUCT SEARCH ===
Type product names to search. Type "quit" to stop.

Enter product name to search (or 'quit' to stop): quit
Exiting program. Goodbye!

 Technologies Used

Java (JDK 24)

IntelliJ IDEA

Git & GitHub

 Skills Demonstrated

Object-oriented programming

Console-based interaction

Input validation

Basic search logic

List & collection processing

Real-world development workflow using IntelliJ IDEA

Git version control and GitHub publishingng sorting options, supporting command line arguments or converting the program into a graphical application using JavaFX.
