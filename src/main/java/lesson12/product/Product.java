package lesson12.product;

public class Product {

    private String productName;
    private double productPrice;
    private int quantity;

    public Product(String productName, double productPrice, int quantity) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return String.format("Product: \nProduct name: %s\nProduct price: %.2f\nQuantity: %d", productName, productPrice, quantity);
    }

}