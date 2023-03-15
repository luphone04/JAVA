package PrepareForExam.Association;

// Author.java
public class Author {
    private String name;
    private String email;

    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}

// Book.java
class Book {
    private String title;
    private Author author;

    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }
}

// Main.java
class Main {
    public static void main(String[] args) {
        Author author = new Author("Jane Doe", "jane.doe@example.com");
        Book book = new Book("The Story of Jane Doe", author);

        System.out.println("Book: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor().getName());
        System.out.println("Author's Email: " + book.getAuthor().getEmail());
    }
}

