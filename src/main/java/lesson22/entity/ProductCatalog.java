package lesson22.entity;

import java.util.Objects;

public class ProductCatalog {

    private String CatalogueProductId;
    private String manufacturer;
    private String ProductName;

    public ProductCatalog(String catalogueProductId, String manufacturer, String productName) {
        CatalogueProductId = catalogueProductId;
        this.manufacturer = manufacturer;
        ProductName = productName;
    }

    public String getCatalogueProductId() {
        return CatalogueProductId;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getProductName() {
        return ProductName;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ProductCatalog that)) return false;
        return Objects.equals(CatalogueProductId, that.CatalogueProductId)
                && Objects.equals(manufacturer, that.manufacturer)
                && Objects.equals(ProductName, that.ProductName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(CatalogueProductId, manufacturer, ProductName);
    }

    @Override
    public String toString() {
        return "ProductCatalog{" +
                "CatalogueProductId='" + CatalogueProductId + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", ProductName='" + ProductName + '\'' +
                '}';
    }

}