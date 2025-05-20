package lesson9.product;

public class Product {

    private String productName;
    private ProductCategory category;
    private double price;
    private int quantity;

    public Product(String productName, ProductCategory category, double price, int quantity) {
        this.productName = productName;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return String.format("%s\nProduct name: %s\nPrice: %.2f\nQuantity: %d",
                category, productName,  price, quantity);
    }

}