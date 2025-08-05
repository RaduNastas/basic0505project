package javaPro.lesson14.order;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class OrderDemo {

    public static void run() {
        List<Order> orders = List.of(
                new Order("ORD1", LocalDate.of(2024, 1, 15), 1200.0, "Shipped"),
                new Order("ORD2", LocalDate.of(2024, 1, 20), 1500.0, "Delivered"),
                new Order("ORD3", LocalDate.of(2024, 2, 5), 2000.0, "Processing"),
                new Order("ORD4", LocalDate.of(2024, 2, 25), 1800.0, "Shipped"),
                new Order("ORD5", LocalDate.of(2024, 3, 10), 2500.0, "Delivered")
        );
        System.out.println("Total orders per month:");

        Map<String, Double> totalPerMonth = orders.stream()
                .collect(Collectors.groupingBy(
                        order -> order.getDate().getMonth().name(),
                        Collectors.summingDouble(Order::getAmount)
                ));
        totalPerMonth.forEach((month, total) ->
                System.out.println(month + ": " + total));
    }

}