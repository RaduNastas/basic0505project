package lesson22.repository;

import lesson22.entity.ProductCatalog;

public class ProductCatalogRepository {

    private ProductCatalog[] products;
    private int index;

    public ProductCatalogRepository(int catalogueSize) {
        this.products = new ProductCatalog[catalogueSize];
        this.index = 0;
    }

    public boolean save(ProductCatalog product) {
        if (index >= products.length) {
            return false;
        }
        products[index++] = product;
        return true;
    }

    public ProductCatalog findProductById(String productId) {
        for (int i = 0; i < index; i++) {
            ProductCatalog product = products[i];
            if (product != null && product.getCatalogueProductId().equalsIgnoreCase(productId)) {
                return product;
            }
        }
        return null;
    }

    public ProductCatalog[] findProductByManufacturer(String manufacturer) {
        ProductCatalog[] temp = new ProductCatalog[index];
        int counter = 0;

        for (int i = 0; i < index; i++) {
            ProductCatalog product = products[i];
            if (product != null && product.getManufacturer().equalsIgnoreCase(manufacturer)) {
                temp[counter++] = product;
            }
        }
        ProductCatalog[] result = new ProductCatalog[counter];
        for (int i = 0; i < counter; i++) {
            result[i] = temp[i];
        }
        return result;
    }

    public ProductCatalog[] findProductByName(String name) {
        ProductCatalog[] temp = new ProductCatalog[index];
        int counter = 0;

        for (int i = 0; i < index; i++) {
            ProductCatalog product = products[i];
            if (product != null && product.getProductName().equalsIgnoreCase(name)) {
                temp[counter++] = product;
            }
        }
        ProductCatalog[] result = new ProductCatalog[counter];
        for (int i = 0; i < counter; i++) {
            result[i] = temp[i];
        }
        return result;
    }

    public ProductCatalog[] findProductByManufacturerAndName(String manufacturer, String name) {
        ProductCatalog[] temp = new ProductCatalog[index];
        int counter = 0;

        for (int i = 0; i < index; i++) {
            ProductCatalog product = products[i];

            if (product != null && product.getManufacturer()
                    .equalsIgnoreCase(manufacturer) && product
                    .getProductName().equalsIgnoreCase(name)) {
                temp[counter++] = product;
            }
        }
        ProductCatalog[] result = new ProductCatalog[counter];
        for (int i = 0; i < counter; i++) {
            result[i] = temp[i];
        }
        return result;
    }

    public ProductCatalog[] findAll() {
        ProductCatalog[] result = new ProductCatalog[index];
        for (int i = 0; i < index; i++) {
            result[i] = products[i];
        }
        return result;
    }

}