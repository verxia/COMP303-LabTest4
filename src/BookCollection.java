import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class BookCollection implements Iterable<Book>{
    private List<Book> aBooks = new ArrayList<Book>();

    public void addBook(Book pBook) {
        aBooks.add(pBook);
    }

    public boolean removeBook(Book pBook) {
        return aBooks.remove(pBook);
    }

    public Book getFirst() {
        assert !aBooks.isEmpty();
        return aBooks.get(0);
    }

    public Iterator<Book> iterator() {
        return Collections.unmodifiableList(aBooks).iterator();
    }

}
