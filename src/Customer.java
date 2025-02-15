public class Customer {
    private int customerID;
    String name;
    String address;

    public Customer(int customerID, String name, String address) {
        this.customerID = customerID;
        this.name = name;
        this.address = address;
    }

    public int getCustomerID() {
        return Math.abs(customerID);
    }

    public void setCustomerID(int customerID) {
        this.customerID = Math.abs(customerID);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
