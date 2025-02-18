public class ClothingProduct extends Product {
    private String size;
    private String fabric;

    public ClothingProduct(int productid, String name, float price, String size, String fabric) {
        super(productid, name, price);
        this.size = size;
        this.fabric = fabric;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getFabric() {
        return fabric;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }
}
