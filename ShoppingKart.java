import java.util.List;

public interface ShoppingKart {
    void addItem(Product product);
    void removeItem(Product product);
    List<KartItem> getCartItems();
    double getTotalPrice();
    void displayKartItems();    
}
