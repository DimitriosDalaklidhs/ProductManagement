ProductManagement

A simple Java console application for managing companies and their products.
This project was intentionally designed not only to demonstrate Java fundamentals but also to showcase practical experience with IntelliJ IDEA as a professional development environment.

 A Note on Project Purpose

Although this repository contains a simple Java console application, the main intention behind the project is to demonstrate my ability to work confidently and efficiently with IntelliJ IDEA. The focus is not only on writing Java code but on showing practical experience with a professional development environment.

Throughout development I created a complete project structure, organized packages, ran and tested the application inside the IDE, configured version control, initialized a local Git repository, connected it to GitHub, committed changes, and published the project directly through IntelliJ IDEA.

This repository is therefore designed to highlight familiarity with IntelliJ IDEA and its workflow rather than to present a large or complex Java system.

Features

This application allows multiple companies to be added, each with several products.
Users can enter product details such as name, code and price.
Product codes are validated to ensure they follow the correct format.
The system identifies the most expensive product across all companies.
A search function allows users to look up products by name regardless of capitalization.
Interaction is entirely console based and simple to run.

Project Structure
ProductManagement/
└── src/
    └── Project/
        ├── Product.java
        ├── Company.java
        └── ProductManagement.java

How to Run
Running inside IntelliJ IDEA

Open the project in IntelliJ, navigate to:
src/Project/ProductManagement.java
and run the main method using the green run button.

Running with terminal
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
Company   : Apple
Product   : MacBook
Code      : MC123456
Price     : 2000.0

=== PRODUCT SEARCH ===
Type product names to search. Type "quit" to stop.
Enter product name to search (or 'quit' to stop): quit
Exiting program. Goodbye!

Technologies Used

Java (JDK 24)
IntelliJ IDEA
Git and GitHub

Skills Demonstrated

Object-oriented design
Console-based interaction
Validation logic
Search algorithms
List processing
Real-world workflow using IntelliJ IDEA, Git and GitHub
Expanding data storage to files or databases, adding sorting options, supporting command line arguments or converting the program into a graphical application using JavaFX.
