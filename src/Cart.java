import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> products;
    private int capacity;

    public Cart(int capacity) {
        this.capacity = capacity;
        products = new ArrayList<>();
    }

    public void addProduct(Product product) throws OutOfCartCapacityException {
        if (products.contains(product)) {
            throw new IllegalArgumentException("Product with the same name already exists in the cart");
        }
        if (getTotalPrice() + product.getTotalPrice() > capacity) {
            throw new OutOfCartCapacityException("Adding this product exceeds cart capacity");
        }
        products.add(product);
    }

    public void removeProductsByName(String name) {
        List<Product> toRemove = new ArrayList<>();
        for (Product product : products) {
            if (product.getName().equals(name)) {
                toRemove.add(product);
            }
        }
        products.removeAll(toRemove);
    }

    public void removeProductsWithHigherPrice(double maxPrice) {
        List<Product> toRemove = new ArrayList<>();
        for (Product product : products) {
            if (product.getTotalPrice() > maxPrice) {
                toRemove.add(product);
            }
        }
        products.removeAll(toRemove);
    }

    public double getTotalPrice() {
        double totalPrice = 0.0;
        for (Product product : products) {
            totalPrice += product.getTotalPrice();
        }
        return totalPrice;
    }

    public List<Product> getProducts() {
        return products;
    }
}
