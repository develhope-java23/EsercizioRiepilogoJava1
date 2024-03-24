import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    @Test
    void setName() {
        assertThrows(InvalidProductParameterException.class, () -> {
            new Product("", 1.0, 1 );
        });
    }

    @Test
    void setUnitPrice() {
        assertThrows(InvalidProductParameterException.class, () -> {
            new Product("noce", 0.0, 1 );
        });
    }

    @Test
    void setQuantity() {
        assertThrows(InvalidProductParameterException.class, () -> {
            new Product("noce", 1.0, 0 );
        });
    }

    @Test
    void getTotalPrice() {
        Product product1 = new Product("noce", 5.0, 2 );
        double result = product1.getTotalPrice();
        assertEquals(10.0, result);
    }
}