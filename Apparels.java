public class Apparels extends Product{
    private String size;
    private String color;

    public Apparels(int ProductId, String ProductName, double Price, String Description, String size, String color) {
        super(ProductId, ProductName, Price, Description);
        this.size = size;
        this.color = color;
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return super.toString() + "Apparels{" +
                "size='" + size + '\'' +
                ", color='" + color + '\'' +
                "} ";
    }
    
}
