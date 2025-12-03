Product Management System

A simple Java console application for managing companies and their products.
Created to demonstrate IntelliJ workflow, Git usage, object-oriented programming, and basic Java development.

Project Purpose

This repository contains a basic Java application, but its main goal is to demonstrate:

Confident use of IntelliJ IDEA
Proper project structure and package organization
Running, testing, and debugging inside the IDE
Using Git version control within IntelliJ
Creating a repository, committing changes, and publishing to GitHub

The project mirrors a real-world beginner development workflow.

Features

Add multiple companies, each with multiple products
Input product details such as name, code, and price
Validate product codes in the format AA123456 (two letters followed by six digits)
Display number of products produced by each company
Find the most expensive product across all companies
Search products by name (case insensitive)
The program runs entirely in the console

Project Structure
ProductManagement/
 └── src/
      └── Project/
           ├── Product.java
           ├── Company.java
           └── ProductManagement.java

How to Run
Running in IntelliJ IDEA

Open the project in IntelliJ IDEA
Navigate to src/Project/ProductManagement.java
Run the main method using the Run button

Running in Terminal

Compile:

javac src/Project/*.java


Run:

java -cp src Project.ProductManagement

Sample Program Output
<details> <summary>Show Output</summary>
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
Company: Apple
Product: MacBook
Code: MC123456
Price: 2000.0

=== PRODUCT SEARCH ===
Type product names to search. Type "quit" to stop.

Enter product name to search (or 'quit' to stop): quit
Exiting program. Goodbye!

</details>
Technologies Used

Java (JDK 24)
IntelliJ IDEA
Git and GitHub

Skills Demonstrated

Object-oriented programming
Console-based user interaction
Input validation
Basic search logic
List and collection processing
Development workflow using IntelliJ
Git version control and GitHub publishing
