public class Product {
    private int ProductId;
    private String ProductName;
    private double Price;
    private String Description;

    public Product(int ProductId, String ProductName, double Price, String Description) {
        this.ProductId = ProductId;
        this.ProductName = ProductName;
        this.Price = Price;
        this.Description = Description;
    }
    public int getProductId() {
        return ProductId;
    }
    public void setProductId(int ProductId) {
        this.ProductId = ProductId;
    }
    public String getProductName() {
        return ProductName;
    }
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }
    public double getPrice() {
        return Price;
    }
    public void setPrice(double Price) {
        this.Price = Price;
    }
    public String getDescription() {
        return Description;
    }
    public void setDescription(String Description) {
        this.Description = Description;
    }
    @Override
    public String toString() {
        return "Product{" + "ProductId=" + ProductId + ", ProductName=" + ProductName + ", Price=" + Price + ", Description=" + Description + '}';
    }    
}
