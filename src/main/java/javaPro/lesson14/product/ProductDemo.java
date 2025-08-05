package javaPro.lesson14.product;

import java.util.*;
import java.util.stream.Collectors;

public class ProductDemo {

    public static void run() {
        List<Product> products = List.of(
                new Product("Laptop", "Electronics", 4500, 8),
                new Product("Monitor", "Electronics", 1200, 12),
                new Product("Mop", "Cleaning", 45, 20),
                new Product("Detergent", "Cleaning", 30, 5),
                new Product("Mouse", "Electronics", 80, 50)
        );
        System.out.println("Average price per category (stock > 10), sorted in descending order:");

        Map<String, Double> avgPriceByCategory = products.stream()
                .filter(product -> product.getStock() > 10)
                .collect(Collectors.groupingBy(
                        Product::getCategory,
                        Collectors.averagingDouble(Product::getPrice)
                ));

        avgPriceByCategory.entrySet().stream()
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }

}