import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Order {
    private int customerId;
    private int orderId = 1;
    private Product[] products;
    private float totalprice;

    public Order(int customerId, float totalprice, Product[] products) {
        this.customerId = Math.abs(customerId);
        this.products = products;
        this.totalprice = totalprice;
        printOrderInfo();
    }

    public void printOrderInfo() {

        //System.out.println("Order ID: "+orderId);
        String Info = "Here's Your order's summary:\nOrder ID: " + orderId + "\nCustomer ID: " + customerId+ "\nProducts: ";
        //System.out.println("Customer ID: "+customerId);
        //System.out.println("Products:");
        DecimalFormat df = new DecimalFormat("0.00");
        for (Product product : products) {
            if (product != null) {
                //System.out.print(products[i].getName());
                Info = Info.concat(product.getName() + " - $" + df.format(product.getPrice()) + "\n");
                //System.out.printf(" - $%.2f", products[i].getPrice());
                //System.out.println();
            }
        }
        // System.out.printf("Total Price: %.2f ",totalprice);
        Info = Info.concat("Total Price: $" + df.format(totalprice));
        JOptionPane.showMessageDialog(null, Info);
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = Math.abs(customerId);
    }

    public int getOrderId() {
        return orderId + 1;
    }

    public void setOrderId(int orderId) {
        this.orderId = Math.abs(orderId);
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public float getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(float totalprice) {
        this.totalprice = totalprice;
    }
}
