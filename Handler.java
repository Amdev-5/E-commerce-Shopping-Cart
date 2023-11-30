public class Handler {
    public static void main(String[] args) {
        ProductFactory productFactory = new ProductFactory();
        Product product = productFactory.createProduct(1, 1, "iPhone 14", 1000, "iPhone 14");
        System.out.println(product.toString());
        System.out.println(product.getPrice());
    }
}
