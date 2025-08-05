package javaPro.lesson14;

import javaPro.lesson14.book.BookDemo;
import javaPro.lesson14.order.OrderDemo;
import javaPro.lesson14.person.PersonDemo;
import javaPro.lesson14.product.ProductDemo;
import javaPro.lesson14.student.StudentDemo;

public class MainDemo {

    public static void main(String[] args) {
        System.out.println("=== Student Demo ===");
        StudentDemo.run();

        System.out.println("\n=== Person Demo ===");
        PersonDemo.run();

        System.out.println("\n=== Product Demo ===");
        ProductDemo.run();

        System.out.println("\n=== Order Demo ===");
        OrderDemo.run();

        System.out.println("\n=== Book Demo ===");
        BookDemo.run();
    }

}