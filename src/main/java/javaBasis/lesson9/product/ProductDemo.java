package javaBasis.lesson9.product;

public class ProductDemo {

    public static void main(String[] args) {

        ProductService productService = new ProductService();

        ProductCategory productCategory1 = productService.createCategory();

        Product product1 = productService.createProduct(productCategory1);
        System.out.println(product1);

        Product product2 = productService.createProduct(productCategory1);
        System.out.println(product2);

        ProductCategory productCategory2 = productService.createCategory();

        Product product3 = productService.createProduct(productCategory2);
        System.out.println(product3);

        productService.scanner.close();
    }

}