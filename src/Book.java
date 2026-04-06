public class Book {
    private final String aTitle;
    private final String aAuthor;
    private final int aYear;

    public Book(String pTitle, String pAuthor, int pYear) {
        aTitle = pTitle;
        aAuthor = pAuthor;
        aYear = pYear;
    }

    String getTitle() {
        return aTitle;
    }

    int getYear() {
        return aYear;
    }

    public String toString() {
        return aTitle;
    }
}
