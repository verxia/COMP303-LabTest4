public class Novel {

    private final String aTitle;
    private final String aAuthor;
    private final int aYear;
    private final boolean aIsYA; // Special field for novels

    public Novel(String pTitle, String pAuthor, int pYear, boolean pIsYA) {
        aTitle = pTitle;
        aAuthor = pAuthor;
        aYear = pYear;
        aIsYA = pIsYA;
    }
    public String getTitle() {
        return aTitle;
    }

    int getYear() {
        return aYear;
    }

    public String toString() {
        return aTitle;
    }
    
}
