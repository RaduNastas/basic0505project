package lesson20.taskVar4;

import lesson18.book.utils.UserInputStaticScanner;

public class UserInterface {
    private final BookService bookService;
    private final int count;

    public UserInterface(BookService bookService, int count) {
        this.bookService = bookService;
        this.count = count;
    }

    public static int getLibrarySize() {
        return UserInputStaticScanner.inputInt("How many books do you want to add? ");
    }

    public void start() {
        addNewBooks();
        menu();
    }

    private void addNewBooks() {
        for (int i = 0; i < count; i++) {

            String id = UserInputStaticScanner.inputText("Input book ID: ");
            String title = UserInputStaticScanner.inputText("Input book title: ");
            String author = UserInputStaticScanner.inputText("Input book author: ");

            Book newBook = new Book(id, title, author);
            boolean result = bookService.addNewBook(newBook);

            if (result) {
                System.out.println("Book successfully added!");
            } else {
                System.out.println("Book could not be added.");
            }
        }
    }

    private void menu() {
        while (true) {
            System.out.println("\n========= BOOK MENU =========");
            System.out.println("0 - Exit");
            System.out.println("1 - Search book by ID");
            System.out.println("2 - Search book by title");
            System.out.println("3 - Search books by author");

            int option = UserInputStaticScanner.inputInt("Your option: ");

            switch (option) {
                case 0 -> {
                    System.out.println("Exiting program. Goodbye!");
                    return;
                }
                case 1 -> searchById();
                case 2 -> searchByTitle();
                case 3 -> searchByAuthor();
                default -> System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private void searchById() {
        String id = UserInputStaticScanner.inputText("Input book ID to search: ");
        Book book = bookService.findBookById(id);

        if (book != null) {
            System.out.println("Book found: " + book);
        } else {
            System.out.println("Book not found with ID: " + id);
        }
    }

    private void searchByTitle() {
        String title = UserInputStaticScanner.inputText("Input book title to search: ");
        Book book = bookService.findBookByTitle(title);

        if (book != null) {
            System.out.println("Book found: " + book);
        } else {
            System.out.println("Book not found with title: " + title);
        }
    }

    private void searchByAuthor() {
        String author = UserInputStaticScanner.inputText("Input author name to search: ");
        Book[] books = bookService.findBooksByAuthor(author);

        if (books.length > 0) {
            System.out.println("Books found by author '" + author + "':");
            for (Book book : books) {
                System.out.println(book);
            }
        } else {
            System.out.println("No books found by author: " + author);
        }
    }

}