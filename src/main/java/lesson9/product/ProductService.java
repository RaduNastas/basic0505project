package lesson9.product;

import java.util.Scanner;

public class ProductService {

    Scanner scanner = new Scanner(System.in);

    public ProductCategory createCategory() {

        System.out.println("Input category name: ");
        String categoryName = scanner.nextLine();

        System.out.println("Input category description: ");
        String categoryDescription = scanner.nextLine();

        return new ProductCategory(categoryName, categoryDescription);

    }

    public Product createProduct(ProductCategory newProduct) {

        System.out.println("Input product name: ");
        String productName = scanner.nextLine();

        System.out.println("Input price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("input quantity: ");
        int quantity = scanner.nextInt();
        scanner.nextLine();

        return new Product(productName, newProduct, price, quantity);
    }

}