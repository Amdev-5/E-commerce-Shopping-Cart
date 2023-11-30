import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ShoppingCartMultithreaded {
    private static final Map<Integer,Product> productMap = new HashMap<Integer, Product>();
    private static final Map<Product,Integer> cartItems = new HashMap<Product, Integer>();
    static {
        // Initialize product information
        Product electronics = new Electronics(1, "Sony Xperia Z3", 499.99, "A powerful smartphone with a stunning display", "Sony", "Xperia Z3");
        Product apparel = new Apparels(2, "Red T-Shirt", 29.99, "A comfortable and stylish red T-shirt", "Medium", "Red");
        Product book = new Books(3, "Harry Potter and the Philosopher's Stone", 19.99, "An enchanting tale of magic and friendship", "J.K. Rowling", 11232);
    }
    
    public static void main(String[] args) throws InterruptedException{
        // Create an executor service to manage threads
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        // Create threads for product browsing, cart updates, and checkout
        Thread productBrowsingThread = new Thread(() -> {
            browseProducts();
        });
        Thread cartUpdateThread = new Thread(() -> {
            updateCart();
        });
        Thread checkoutThread = new Thread(() -> {
            checkout();
        });

        // Start the threads
        executorService.execute(productBrowsingThread);
        executorService.execute(cartUpdateThread);
        executorService.execute(checkoutThread);

        // Wait for all threads to finish
        executorService.shutdown();
        while (!executorService.isTerminated()) {
            Thread.sleep(100);
        }

    }

    private static void browseProducts() {
        // Simulate product browsing by iterating over the product map
        for (Product product : productMap.values()) {
            System.out.println("Browsing product: " + product);
        }
    }

    private static synchronized void updateCart() {
        // Simulate adding an item to the cart
        int productId = 2; // Apparel product
        Product product = productMap.get(productId);
        cartItems.put(product, 1);

        System.out.println("Added product to cart: " + product);
    }

    private static synchronized void checkout() {
        // Simulate checkout by displaying cart contents and total price
        System.out.println("Cart items:");
        for (Map.Entry<Product, Integer> entry : cartItems.entrySet()) {
            Product product = entry.getKey();
            int quantity = entry.getValue();
            System.out.println(product + " " + quantity);
        }
    } 
}
