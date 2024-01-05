package Easy.third;

public class third {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book(1, "Author1", "Title1", 100);
        Book book2 = new Book(2, "Author2", "Title2", 150);

        library.addBook(book1);
        library.addBook(book2);

        Book foundBook = library.findBookById(1);

        if (foundBook != null) {
            System.out.println("Book found: " + foundBook.title + " by " + foundBook.author);
        } else {
            System.out.println("Book not found.");
        }
    }
}

