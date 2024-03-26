import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {
    @Test
    public void testGetTotalPrice() throws InvalidProductParameterException {
        Product product = new Product("Test Product", 10.5, 3);
        assertEquals(31.5, product.getTotalPrice(), 0.001);
    }

    @Test
    public void testInvalidName() {
        assertThrows(InvalidProductParameterException.class, () -> {
            new Product("", 10.5, 3);
        });
    }

    @Test
    public void testInvalidUnitPrice() {
        assertThrows(InvalidProductParameterException.class, () -> {
            new Product("Test Product", -5.0, 3);
        });
    }

    @Test
    public void testInvalidQuantity() {
        assertThrows(InvalidProductParameterException.class, () -> {
            new Product("Test Product", 10.5, -3);
        });
    }
}