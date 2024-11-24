import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    // Add a book to the library
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Added: " + book.toString());
    }

    // Remove a book from the library
    public void removeBook(Book book) {
        if (books.remove(book)) {
            System.out.println("Removed: " + book.toString());
        } else {
            System.out.println("Book not found: " + book.toString());
        }
    }

    // List all books in the library
    public void listAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            System.out.println("Books in the library:");
            for (Book book : books) {
                System.out.println(book.toString());
            }
        }
    }

    public static void main(String[] args) {
        Library library = new Library();

        // Creating books
        Book book1 = new Book("Java", "Satyam", "1985423780");
        Book book2 = new Book("Python", "Anshu", "249976446");
        Book book3 = new Book("Geography", "Mithi", "5446797675");

        // Adding books to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Listing all books
        library.listAllBooks();

        // Removing a book
        library.removeBook(book1);

        // Listing all books again
        library.listAllBooks();
    }
}
