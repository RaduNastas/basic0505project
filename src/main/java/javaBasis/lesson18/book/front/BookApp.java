package javaBasis.lesson18.book.front;

import javaBasis.lesson18.book.repository.BookRepository;
import javaBasis.lesson18.book.service.BookService;

public class BookApp {

    public static void main(String[] args) {

        BookRepository bookRepository = new BookRepository();
        BookService bookService = new BookService(bookRepository);
        UserInterface userInterface = new UserInterface(bookService);

        userInterface.menu();
    }

}