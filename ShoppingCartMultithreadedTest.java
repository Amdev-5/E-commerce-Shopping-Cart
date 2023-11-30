import org.junit.*;
public class ShoppingCartMultithreadedTest {
    @Test
    public void testBrowseProducts() {
         // Arrange
         ShoppingCartMultithreaded shoppingCart = new ShoppingCartMultithreaded();
         // Act
         shoppingCart.browseProducts();
         // Assert
         // Verify that product map is not empty
         Assertions.assertFalse(shoppingCart.productMap.isEmpty());
    }

    // Arrange
    ShoppingCartMultithreaded shoppingCart = new ShoppingCartMultithreaded();
    // Act
    shoppingCart.browseProducts();
    // Assert
    // Verify that product map is not empty
    Assertions.assertFalse(shoppingCart.productMap.isEmpty());
}

    
}
