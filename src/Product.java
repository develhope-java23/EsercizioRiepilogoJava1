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
        if (name.isEmpty()) {
            throw new InvalidProductParameterException("name non può essere vuoto");
        } else {
            name = name;
        }
        if (quantity <= 0) {
            throw new InvalidProductParameterException("quantity deve essere maggiore di zero");
        } else {
            this.quantity = quantity;
        }
        if (unitPrice <= 0.0) {
            throw new InvalidProductParameterException("unitPrice deve essere maggiore di zero");
        } else {
            this.unitPrice = unitPrice;
        }
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
        if (name.isEmpty()) {
            throw new InvalidProductParameterException("name non può essere vuoto");
        } else {
            this.name = name;
        }
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice <= 0.0) {
            throw new InvalidProductParameterException("unitPrice deve essere maggiore di zero");
        } else {
            this.unitPrice = unitPrice;
        }
    }

    public void setQuantity(int quantity) {
        if (quantity <= 0) {
            throw new InvalidProductParameterException("quantity deve essere maggiore di zero");
        } else {
            this.quantity = quantity;
        }
    }
    public double getTotalPrice() {
        return(getUnitPrice() * getQuantity());
    }
}
