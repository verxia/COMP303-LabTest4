public class Main {
    public static void main(String[] args) {

        // Some books to help with testing
        Book thePrincessBride = new Book("The Princess Bride", "William Goldman", 1943); // Novel
        Novel aTreeGrowsInBrooklyn = new Novel("A Tree Grows in Brooklyn", "Betty Smith", 1973); // Novel
        Novel aLittlePrincess = new Novel("A Little Princess", "Frances Hodgson Burnett", 1905); // Novel
        Nonfiction sayNothing = new Nonfiction("Say Nothing", "Patrick Radden Keefe", 2018, 364.1523); // Non-fiction
        Nonfiction inColdBlood = new Nonfiction("In Cold Blood", "Truman Capote", 1966, 364.1523); // Non-fiction

        BookCollection books = new BookCollection();
    }

}
