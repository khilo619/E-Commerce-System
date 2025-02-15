import java.util.*;
import javax.swing.JOptionPane;
public class EcommerceSystem {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        /*System.out.println("Welcome to the E-commerce System!");
        System.out.println("");
        System.out.println("Please enter your id");
        int customerid = k.nextInt();
        System.out.println("Please enter your name");
        k.nextLine();
        String name = k.nextLine();
        System.out.println("Please enter your address");
        String address = k.nextLine();*/
       // Cart cart = new Cart(customerid);
        JOptionPane.showMessageDialog(null,"Welcome to the E-commerce System!");
        int customerid = Integer.parseInt(JOptionPane.showInputDialog("Please enter your id"));
        String name = JOptionPane.showInputDialog("Please enter your name");
        String address = JOptionPane.showInputDialog("Please enter your address");
        Cart cart = new Cart(customerid);
    }
}
