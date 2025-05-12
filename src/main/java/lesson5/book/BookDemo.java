package lesson5.book;

public class BookDemo {

    public static void main(String[] args) {

        Book book1 = new Book();
        book1.title = "Java ist auch eine Insel";
        book1.author = "Christian Ullenboom";
        book1.year = 2024;
        book1.isIssued = true;

        System.out.println("Information about the book N1.");
        System.out.println("Book title: " + book1.title);
        System.out.println("Book author: " + book1.author);
        System.out.println("The book was published in: " + book1.year);
        System.out.println("The book is issued: " + book1.isIssued);
        System.out.println();

        Book book2 = new Book();
        book2.title = "How to be a good programmer";
        book2.author = "Simion Simionov";
        book2.year = 2025;
        book2.isIssued = false;
        System.out.println("Information about the book N2.");
        System.out.println("Book title: " + book2.title);
        System.out.println("Book author: " + book2.author);
        System.out.println("The book was published in: " + book2.year);
        System.out.println("The book is issued: " + book2.isIssued);
    }

}