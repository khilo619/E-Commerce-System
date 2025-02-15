public class ElectronicProduct extends Product {
    private String brand;
    private int warrantyPeriod;

    public String getBrand() {
        return brand;
    }

    public ElectronicProduct(int productid, String name, float price, String brand, int warrantyPeriod) {
        super(productid, name, price);
        this.brand = brand;
        this.warrantyPeriod = warrantyPeriod;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = Math.abs(warrantyPeriod);
    }
}
