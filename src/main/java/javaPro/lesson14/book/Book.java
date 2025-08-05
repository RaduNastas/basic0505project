package javaPro.lesson14.book;

import java.util.List;
import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private List<String> tags;

    public Book(String title, String author, List<String> tags) {
        this.title = title;
        this.author = author;
        this.tags = tags;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public List<String> getTags() {
        return tags;
    }

    @Override
    public String toString() {
        return String.format("Book{title='%s', author='%s', tags=%s}", title, author, tags);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return Objects.equals(title, book.title) &&
                Objects.equals(author, book.author) &&
                Objects.equals(tags, book.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, tags);
    }

}