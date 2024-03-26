import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CartTest {
    @Test
    public void testAddProduct() throws InvalidProductParameterException, OutOfCartCapacityException {
        Cart cart = new Cart(100);
        Product product1 = new Product("Product 1", 10.0, 2);
        Product product2 = new Product("Product 2", 20.0, 3);

        cart.addProduct(product1);
        cart.addProduct(product2);

        assertEquals(50.0, cart.getTotalPrice(), 0.001);
    }

    @Test
    public void testAddProductWithSameName() throws InvalidProductParameterException {
        Cart cart = new Cart(100);
        Product product1 = new Product("Product", 10.0, 2);
        Product product2 = new Product("Product", 20.0, 3);

        assertThrows(IllegalArgumentException.class, () -> {
            cart.addProduct(product1);
            cart.addProduct(product2);
        });
    }

    @Test
    public void testAddProductExceedingCapacity() throws InvalidProductParameterException {
        Cart cart = new Cart(50);
        Product product = new Product("Product", 30.0, 2);

        assertThrows(OutOfCartCapacityException.class, () -> {
            cart.addProduct(product);
        });
    }

    @Test
    public void testRemoveProductsByName() throws InvalidProductParameterException, OutOfCartCapacityException {
        Cart cart = new Cart(100);
        Product product1 = new Product("Product 1", 10.0, 2);
        Product product2 = new Product("Product 2", 20.0, 3);
        Product product3 = new Product("Product 1", 15.0, 1);

        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.addProduct(product3);

        cart.removeProductsByName("Product 1");

        assertEquals(20.0, cart.getTotalPrice(), 0.001);
    }

    @Test
    public void testRemoveProductsWithHigherPrice() throws InvalidProductParameterException, OutOfCartCapacityException {
        Cart cart = new Cart(100);
        Product product1 = new Product("Product 1", 10.0, 2);
        Product product2 = new Product("Product 2", 20.0, 3);
        Product product3 = new Product("Product 3", 25.0, 1);

        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.addProduct(product3);

        cart.removeProductsWithHigherPrice(20.0);

        assertEquals(30.0, cart.getTotalPrice(), 0.001);
    }
}
