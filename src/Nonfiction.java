public class Nonfiction {

    private final String aTitle;
    private final String aAuthor;
    private final int aYear;
    private final double aDeweyDecimal; // Special field for non-fiction books

    public Nonfiction(String pTitle, String pAuthor, int pYear, double pDeweyDecimal) {
        aTitle = pTitle;
        aAuthor = pAuthor;
        aYear = pYear;
        aDeweyDecimal = pDeweyDecimal;
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
