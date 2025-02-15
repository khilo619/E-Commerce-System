# E-commerce System

A simple Java-based E-commerce system that allows customers to interactively add products to a cart, calculate totals, and place orders. This project demonstrates object-oriented programming concepts in Java, including inheritance and polymorphism.

## Features

- **Product Catalog**: Supports various product types such as:
  - **Electronic Products** (e.g., Smartphone)
  - **Clothing Products** (e.g., T-shirt)
  - **Book Products** (e.g., OOP book)
- **Shopping Cart**: 
  - Add products to the cart.
  - Remove products from the cart.
  - Calculate the total price of products.
- **Order Processing**:
  - Display an order summary with product details and total price.
- **User Interaction**: Uses `JOptionPane` dialogs for input and messages.

## Project Structure

- **Product.java**  
  The base class for all products. It contains common attributes like `productid`, `name`, and `price`.

- **ElectronicProduct.java**  
  Extends `Product` and adds attributes like `brand` and `warrantyPeriod`.

- **ClothingProduct.java**  
  Extends `Product` and adds attributes like `size` and `fabric`.

- **BookProduct.java**  
  Extends `Product` and adds attributes like `author` and `publisher`.

- **Customer.java**  
  Represents a customer with an ID, name, and address.

- **Cart.java**  
  Manages the shopping cart functionality, including adding/removing products, calculating total price, and initiating order placement.

- **Order.java**  
  Handles order creation and displays an order summary including order ID, customer ID, product details, and total price.

- **EcommerceSystem.java**  
  Contains the `main` method to run the application. It initiates customer information collection and cart processing.

## Requirements

- Java JDK 8 or higher.
- An IDE (such as Eclipse or IntelliJ IDEA) or a text editor for Java development.

## Setup and Execution

1. **Clone the Repository**
   ```bash
   git clone <repository-url>
   cd <repository-directory>
   ```

2. **Compile the Project**
   - **Using Command Line:**
     ```bash
     javac *.java
     ```
   - **Using an IDE:**
     - Open the project in your IDE.
     - Build the project.

3. **Run the Application**
   - **Using Command Line:**
     ```bash
     java EcommerceSystem
     ```
   - **Using an IDE:**
     - Run the `main` method in the `EcommerceSystem` class.

## Usage

1. **Welcome Message**: The application starts with a welcome message.
2. **Customer Information**: You will be prompted to enter your customer ID, name, and address.
3. **Add Products**:  
   - You will specify the number of products to add to your cart.
   - For each product, choose from:
     - **1**: Electronic Product (Smartphone)
     - **2**: Clothing Product (T-shirt)
     - **3**: Book Product (OOP book)
4. **Order Processing**:
   - The total price is calculated and displayed.
   - You have the option to place the order or remove a product from the cart.
   - An order summary is then generated and displayed via a dialog.

## Contributing

Contributions are welcome! Feel free to fork the repository and submit pull requests with improvements or bug fixes.


## Acknowledgments

- This project uses `JOptionPane` for interactive GUI dialogs.
- It is designed to demonstrate fundamental object-oriented programming concepts in Java.

