package Easy.third;
import java.util.Map;
import java.util.HashMap;
public class Library {
    private Map<Integer,Book> bookMap;

    public Library() {
        this.bookMap = new HashMap<>();
    }

    public void addBook(Book book){
        bookMap.put(book.id, book);
    }
    public Book findBookById(int id) {
        return bookMap.get(id);
    }
}
