public class Product {
    private String name;
    private double unitPrice;
    private int quantity;

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                '}';
    }

    public Product(String name, double unitPrice, int quantity) throws InvalidProductParameterException {
        verifyNameIntegrity(name);
        verifyUnitPriceIntegrity(unitPrice);
        verifyQuantityIntegrity(quantity);
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }


    public String getName() {
        return name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        verifyNameIntegrity(name);
        this.name = name;
    }

    public void setUnitPrice(double unitPrice) {
        verifyUnitPriceIntegrity(unitPrice);
        this.unitPrice = unitPrice;
    }

    public void setQuantity(int quantity) {
        verifyQuantityIntegrity(quantity);
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return unitPrice * quantity;
    }

    private void verifyNameIntegrity(String name) {
        if (name.isEmpty()) {
            throw new InvalidProductParameterException("name non può essere vuoto");
        }
    }

    private void verifyUnitPriceIntegrity(double unitPrice) {
        if (unitPrice <= 0) {
            throw new InvalidProductParameterException("unitPrice deve essere maggiore di zero");
        }
    }

    private void verifyQuantityIntegrity(int quantity) {
        if (quantity <= 0) {
            throw new InvalidProductParameterException("quantity deve essere maggiore di zero");
        }
    }
}
