public class ProductFactory {
    public Product createProduct(int productType, int productId, String name, double price, String description) {
        Product product = null;
        switch (productType) {
            case 1:
                product = new Electronics(productId, name, price, description,"Apple","Iphone 14");
                break;
            case 2:
                product = new Apparels(productId, name, price, description,"Medium","Red");
                break;
            case 3:
                product = new Books(productId, name, price, description,"Mark Douglas",11323);
                break;
            }
        return product;
    }   
}
