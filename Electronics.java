public class Electronics extends Product {
    private String brand;
    private String model;

    public Electronics(int ProductId, String ProductName, double Price, String Description, String brand, String model) {
        super(ProductId, ProductName, Price, Description);
        this.brand = brand;
        this.model = model;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    @Override
    public String toString() {
        return super.toString() + " Electronics{" +
        "brand='" + brand + '\'' +
        ", model='" + model + '\'' +
        '}';
    }
}
