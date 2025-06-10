package lesson18.book.service;

import lesson18.book.entity.Book;
import lesson18.book.repository.BookRepository;

public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book createBook(String name, String author) {
        Book book = new Book(name, author);
        boolean isSaved = bookRepository.save(book);
        if (isSaved) {
            return book;
        } else {
            return null;
        }
    }

    public Book getBookById(int id) {
        return bookRepository.findById(id);
    }

    public Book[] getAllBooks() {
        return bookRepository.allBooks();
    }

}