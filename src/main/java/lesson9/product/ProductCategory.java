package lesson9.product;

public class ProductCategory {

    private final String categoryName;
    private final String categoryDescription;

    public ProductCategory(String categoryName, String categoryDescription) {
        this.categoryName = categoryName;
        this.categoryDescription = categoryDescription;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }

    @Override
    public String toString() {
        return String.format("Category name: %s\nCategory description: %s",
                categoryName, categoryDescription);
    }
}
