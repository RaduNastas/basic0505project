package lesson20.taskVar4;

public class BookDemo {
    public static void main(String[] args) {

        int librarySize = UserInterface.getLibrarySize();

        BookRepository repository = new BookRepository(librarySize);
        BookService service = new BookService(repository);
        UserInterface userInterface = new UserInterface(service, librarySize);

        userInterface.start();
    }

}