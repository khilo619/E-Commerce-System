import com.sun.security.jgss.GSSUtil;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Cart {
    private int customerID;
    private int nProducts;
    Product[] products;

    public Cart(int customerID) {
        Scanner k = new Scanner(System.in);
        //System.out.println("How many products you want to add to the cart?");
        ///this.nProducts = k.nextInt();
        this.nProducts = Integer.parseInt(JOptionPane.showInputDialog("How many products you want to add to the cart?"));
        this.customerID = customerID;
        this.products = new Product[Math.abs(nProducts)];
        for (int i = 0; i < products.length; i++) {
            //System.out.println("Which product would you like to add? 1- Smartphone 2- T-Shirt 3- OOP");
            // int choose = k.nextInt();
            int choose = Integer.parseInt(JOptionPane.showInputDialog("Which product would you like to add? 1- Smartphone 2- T-Shirt 3- OOP"));
            switch (choose){
                case 1:
                    ElectronicProduct E = new ElectronicProduct(1, "smartphone", 599.9f, "Samsung", 1);
                    addProduct(E, i);
                    break;
                case 2:
                    ClothingProduct C = new ClothingProduct(2, "T-shirt", 19.9f, "Medium", "Cotton");
                    addProduct(C, i);
                    break;
                case 3:
                    BookProduct B = new BookProduct(3, "OOP", 39.9f, "O Relly", "X Publication");
                    addProduct(B, i);
                    break;
            }
        }
        calculatePrice();
        placeOrder();
    }

    public void addProduct(Product p, int index) {
        if (index < products.length) {
            products[index] = p;
        } else {
            //System.out.println("### The Array Is FUll###");
            JOptionPane.showMessageDialog(null, "### The Array Is FUll###");
        }
    }

    public float calculatePrice() {
        float totalprice = 0;
        for (Product product : products) {
            if (product != null)
                totalprice += (float) product.getPrice();
        }
        return totalprice;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = Math.abs(customerID);
    }

    public int getnProducts() {
        return nProducts;
    }

    public void setnProducts(int nProducts) {
        this.nProducts = Math.abs(nProducts);
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public void removeProduct(int index) {
        if (index >= 0 && index < nProducts) {
            products[index] = null;
        } else {
            // System.out.println("INVALIDE, HARDLUCK NEXT TIME");
            JOptionPane.showMessageDialog(null, "INVALIDE, HARDLUCK NEXT TIME");
        }
    }

    public void placeOrder() {
        Scanner k = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        //System.out.printf("Your total is $%.2f", calculatePrice());
        JOptionPane.showMessageDialog(null, "Your total is " + df.format(calculatePrice()));
        //System.out.println(" . Would you like to place the order? 1- Yes 2- No");
        //int po = k.nextInt();
        int po = Integer.parseInt(JOptionPane.showInputDialog("Would you like to place the order? 1- Yes 2- No"));
        if (po == 1) {
            // System.out.println("Here's your order's summary");
            //Order o = new Order(customerID, calculatePrice(), products);
            Order o = new Order(customerID, calculatePrice(), products);
        } else if (po == 2) {
            //System.out.println("ENTER THE PRODUCT'S INDEX YOU WANT TO REMOVE FROM (1 - " + nProducts + ")");
            // int removing_index = k.nextInt();
            int removing_index = Integer.parseInt(JOptionPane.showInputDialog("ENTER THE PRODUCT'S INDEX YOU WANT TO REMOVE FROM (1 - " + nProducts + ")"));
            removeProduct(removing_index - 1);
            Order o = new Order(customerID, calculatePrice(), products);
        }
    }
}
