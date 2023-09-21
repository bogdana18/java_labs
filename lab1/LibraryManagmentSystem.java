import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Book {
    private String title;
    private String author;
    private String isbn;
    private int year;

    public Book(String title, String author, String isbn, int year) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public int Year() {
        return year;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn + ", Year: " + year;
    }
}

class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(String title, String author, String isbn, int year) {
        Book newBook = new Book(title, author, isbn, year);
        books.add(newBook);
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }

    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public void removeBookByIsbn(String isbn) {
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getIsbn().equals(isbn)) {
                iterator.remove();
                System.out.println("Book with ISBN " + isbn + " has been removed");
                return;
            }
        }
        System.out.println("Book with ISBN " + isbn + " not found");
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook("Book 1", "Author 1", "44444", 2021);
        library.addBook("Book 2", "Author 2", "5555", 2022);

        System.out.println("All books in the library:");
        library.displayBooks();

        String searchTitle = "Book 1";
        Book foundBook = library.findBookByTitle(searchTitle);
        if (foundBook != null) {
            System.out.println("\nFound book by title '" + searchTitle + "':");
            System.out.println(foundBook.toString());
        } else {
            System.out.println("\nBook with title '" + searchTitle + "' not found.");
        }

        String isbnToRemove = "44444";
        library.removeBookByIsbn(isbnToRemove);

        System.out.println("\nUpdated list of books in the library:");
        library.displayBooks();
    }
}