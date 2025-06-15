package lesson22.service;

import lesson22.entity.ProductCatalog;
import lesson22.repository.ProductCatalogRepository;

public class ProductCatalogService {

    ProductCatalogRepository repository;

    public ProductCatalogService(ProductCatalogRepository repository) {
        this.repository = repository;
    }

    public boolean addProduct(String productId, String manufacturer, String name) {
        ProductCatalog product = new ProductCatalog(productId, manufacturer, name);
        return repository.save(product);
    }

    public ProductCatalog getProductById(String id) {
        return repository.findProductById(id);
    }

    public ProductCatalog[] getProductByManufacturer(String manufacturer) {
        return repository.findProductByManufacturer(manufacturer);
    }

    public ProductCatalog[] getProductByName(String name) {
        return repository.findProductByName(name);
    }

    public ProductCatalog[] getProductByManufacturerAndName(String manufacturer, String name) {
        return repository.findProductByManufacturerAndName(manufacturer, name);
    }

    public ProductCatalog[] getAllProducts() {
        return repository.findAll();
    }

}