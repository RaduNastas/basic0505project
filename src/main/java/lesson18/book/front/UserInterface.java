package lesson18.book.front;

import lesson18.book.entity.Book;
import lesson18.book.service.BookService;
import lesson18.book.utils.UserInputStaticScanner;

public class UserInterface {

    private final BookService bookService;

    public UserInterface(BookService bookService) {
        this.bookService = bookService;
    }

    public void menu() {
        int booksCounter = UserInputStaticScanner.inputInt("How many books you want created? ");
        for (int i = 0; i < booksCounter; i++) {

            String name = UserInputStaticScanner.inputText("Input name: ");
            String author = UserInputStaticScanner.inputText("input author: ");

            bookService.createBook(name, author);
        }
        System.out.println("\nBooks created:");

        Book[] allBooks = bookService.getAllBooks();
        for (Book book : allBooks) {
            System.out.println(book);

        }
        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1 - Search book by ID");
            System.out.println("2 - Exit");

            int option = UserInputStaticScanner.inputInt("Your option: ");

            switch (option) {
                case 1:
                    int id = UserInputStaticScanner.inputInt("Input book ID to search: ");
                    Book book = bookService.getBookById(id);
                    if (book != null) {
                        System.out.println("Book found: " + book);
                    } else {
                        System.out.println("Book not found with ID: " + id);
                    }
                    break;

                case 2:
                    System.out.println("Exiting program. Goodbye!");
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

}