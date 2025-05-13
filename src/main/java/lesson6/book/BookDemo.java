package lesson6.book;

public class BookDemo {

    public static void main(String[] args) {

        Book book1 = new Book("Fullstack", "Philip Ackermann", true);
        book1.displayInfo();
        book1.setIssued();
        book1.displayInfo();
        book1.setIsReturned();
        book1.displayInfo();
    }
}
