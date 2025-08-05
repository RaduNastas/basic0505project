package javaPro.lesson14.book;

import java.util.List;

public class BookDemo {

    public static void run() {
        List<Book> books = List.of(
                new Book("Java 17", "Popescu", List.of("java", "programming", "backend")),
                new Book("Spring Boot", "Ionescu", List.of("java", "spring", "backend")),
                new Book("Python Start", "Vasilescu", List.of("python", "beginner", "data"))
        );

        System.out.println("Unique tags in books:");
        List<String> uniqueTags = books.stream()
                .flatMap(book -> book.getTags().stream())
                .distinct()
                .sorted()
                .toList();
        uniqueTags.forEach(System.out::println);
    }

}