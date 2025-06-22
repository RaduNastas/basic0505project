package javaBasis.lesson6.book;

/**
 * Create a Book class that will have the following fields:
 * title, author, and whether the book is in the library or issued to a reader.
 * Write a method that "issues" a book and "returns" it from the reader.
 */

public class Book {

    String title;
    String author;
    boolean isIssued;

        public Book(String title, String author, boolean isIssued) {
        this.title = title;
        this.author = author;
        this.isIssued = isIssued;
    }

    public void setIssued() {
        isIssued = true;
        System.out.println("The book is now issued.");
    }

    public void setIsReturned() {
        isIssued = false;
        System.out.println("The book is now returned.");
    }

    public void displayInfo() {
        System.out.printf("The book title is: %s", title);
        System.out.printf("\nThe book author is: %s", author);
        System.out.println("\nBook is issued: " + isIssued);
    }

}