package lesson18.book.repository;

import lesson18.book.entity.Book;

public class BookRepository {

    int booksNumber = 5000;
    private final Book[] books;
    private int booksCounter;

    public BookRepository() {
        this.books = new Book[booksNumber];
        this.booksCounter = 0;
    }

    public boolean save(Book book) {
        if (booksCounter < books.length) {
            books[booksCounter++] = book;
            return true;
        }
        return false;
    }

    public Book findById(int bookId) {
        for (int i = 0; i < booksCounter; i++) {
            if (books[i].getId() == bookId) {
                return books[i];
            }
        }
        return null;
    }

    public Book[] allBooks() {
        Book[] result = new Book[booksCounter];
        for (int i = 0; i < booksCounter; i++) {
            result[i] = books[i];
        }
        return result;
    }

}