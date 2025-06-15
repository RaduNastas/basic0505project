package lesson22.service;

import lesson22.entity.ProductCatalog;
import lesson22.repository.ProductCatalogRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductCatalogServiceTest {

    ProductCatalogRepository smallRepository;
    ProductCatalogService smallService;

    ProductCatalogRepository repository;
    ProductCatalogService service;

    @BeforeEach
    void setUp() {
        smallRepository = new ProductCatalogRepository(1);
        smallService = new ProductCatalogService(smallRepository);

        repository = new ProductCatalogRepository(15);
        service = new ProductCatalogService(repository);
    }

    @Test
    void addProductSucces() {
        assertTrue(smallService.addProduct("R 1", "Sonny", "Player"));
    }

    @Test
    void addProductFailureWhenFullReturnFalse() {
        assertTrue(smallService.addProduct("R 1", "Sonny", "Player"));
        assertFalse(smallService.addProduct("R 1", "Sonny", "Player"));
    }

    @Test
    void getProductByIdSucces() {
        ProductCatalog product = new ProductCatalog("R 1", "Sonny", "Player");
        smallService.addProduct("R 1", "Sonny", "Player");
        ProductCatalog foundedProduct = smallService.getProductById("R 1");
        assertEquals(product, foundedProduct);
    }

    @Test
    void getProductByIdWhenNotExistReturnNull() {
        ProductCatalog foundedProduct = service.getProductById("R 1");
        assertNull(foundedProduct);
    }

    @Test
    void getProductByManufacturer() {
        service.addProduct("P001", "Samsung", "GalaxyTab");
        service.addProduct("P002", "Apple", "iPhone");
        service.addProduct("P003", "Apple", "iPad");

        ProductCatalog[] foundProducts = service.getProductByManufacturer("Apple");
        assertEquals(2, foundProducts.length);

        assertEquals("P002", foundProducts[0].getCatalogueProductId());
        assertEquals("P003", foundProducts[1].getCatalogueProductId());
    }

    @Test
    void getProductByManufacturerWhenNoneMatchReturnsEmpty() {
        service.addProduct("P001", "Samsung", "GalaxyTab");
        ProductCatalog[] found = service.getProductByManufacturer("Lenovo");
        assertEquals(0, found.length);
    }

    @Test
    void getProductByNameSucces() {
        service.addProduct("P001", "Samsung", "GalaxyTab");
        service.addProduct("P002", "Apple", "iPhone");
        service.addProduct("P003", "Samsung", "GalaxyTab");

        ProductCatalog[] foundProducts = service.getProductByName("GalaxyTab");
        assertEquals(2, foundProducts.length);
    }

    @Test
    void getProductByNameWhenNoneMatchReturnsEmpty() {
        service.addProduct("P001", "Samsung", "GalaxyTab");
        ProductCatalog[] found = service.getProductByName("iPhone");
        assertEquals(0, found.length);
    }

    @Test
    void getProductByManufacturerAndName() {
        service.addProduct("P001", "Samsung", "GalaxyTab");
        service.addProduct("P002", "Apple", "iPhone");
        service.addProduct("P003", "Samsung", "GalaxyTab");

        ProductCatalog[] foundProducts = service.getProductByManufacturerAndName("Samsung", "GalaxyTab");
        assertEquals(2, foundProducts.length);
    }

    @Test
    void getAllProducts() {
        service.addProduct("P001", "Samsung", "GalaxyTab");
        service.addProduct("P002", "Apple", "iPhone");
        service.addProduct("P003", "Lenovo", "ThinkPad");
        service.addProduct("P004", "Sony", "Xperia");
        service.addProduct("P005", "Dell", "Inspiron");
        service.addProduct("P006", "HP", "Pavilion");
        service.addProduct("P007", "Xiaomi", "MiPad");
        service.addProduct("P008", "Google", "Pixel");
        service.addProduct("P009", "Huawei", "MateBook");
        service.addProduct("P010", "Microsoft", "Surface");

        ProductCatalog[] foundProducts = service.getAllProducts();
        assertEquals(10, foundProducts.length);
    }

}