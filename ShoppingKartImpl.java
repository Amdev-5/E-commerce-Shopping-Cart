import java.util.ArrayList;
import java.util.List;

public class ShoppingKartImpl implements ShoppingKart{
    private List<KartItem> items = new ArrayList<KartItem>();
    
    @Override
    public void addItem(Product product) {
        KartItem kartItem = new KartItem(product, 1);
        items.add(kartItem);
    }

    @Override
    public void removeItem(Product product) {
        KartItem kartItemToRemove = null;
        for (KartItem item : items) {
            if(item.getProduct().equals(product)){
                kartItemToRemove = item;
                break;
            }
            if (kartItemToRemove!=null) {
                items.remove(kartItemToRemove);
                break;
            }
        }
    }

    @Override
    public List<KartItem> getCartItems(){
        return items;
    }

    @Override
    public double getTotalPrice() {
        double totalPrice = 0;
        for (KartItem item : items) {
            totalPrice += item.getProduct().getPrice();
        }
        return totalPrice;
    }

    @Override
    public void displayKartItems() {
        System.out.println("Cart Items");
        for (KartItem item : items) {
            System.out.println(item);
        }
        System.out.println("Total Price" + getTotalPrice());
    }

}