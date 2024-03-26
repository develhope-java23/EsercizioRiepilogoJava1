public class Product {
    private String name;
    private double unitPrice;
    private int quantity;

    public Product(String name, double unitPrice, int quantity) throws InvalidProductParameterException {
        setName(name);
        setUnitPrice(unitPrice);
        setQuantity(quantity);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws InvalidProductParameterException {
        if (name == null || name.trim().isEmpty()) {
            throw new InvalidProductParameterException("Name cannot be empty");
        }
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) throws InvalidProductParameterException {
        if (unitPrice <= 0.0) {
            throw new InvalidProductParameterException("Unit price must be greater than 0.0");
        }
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) throws InvalidProductParameterException {
        if (quantity <= 0) {
            throw new InvalidProductParameterException("Quantity must be greater than 0");
        }
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return unitPrice * quantity;
    }
}
