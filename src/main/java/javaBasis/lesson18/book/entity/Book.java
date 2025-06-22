package javaBasis.lesson18.book.entity;

public class Book {

    private static int nextId = 1;
    private int id;
    private String name;
    private String author;

    public Book(String name, String author) {
        this.id = nextId++;
        this.name = name;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book № " + id + ": \nBook name: " + name + "\nAuthor: " + author;
    }

}