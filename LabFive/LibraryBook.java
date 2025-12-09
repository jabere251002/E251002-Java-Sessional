class LibraryBook {
    String title;
    String author;
    int bookID;

    LibraryBook(String title, String author, int bookID) {
        this.title = title;
        this.author = author;
        this.bookID = bookID;
    }

    void displayBookInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Book ID: " + bookID);
    }
}

public class Main {
    public static void main(String[] args) {
        LibraryBook book1 =
            new LibraryBook("Game development with Java", "Adnan Ajmain", 3);
        LibraryBook book2 =
            new LibraryBook("AI & Machine Learning", "Al Jaber", 21);
        LibraryBook book3 =
            new LibraryBook("Python Programming", "Abdullah Al Mamun", 10);

        book1.displayBookInfo();
        System.out.println();
        book2.displayBookInfo();
        System.out.println();
        book3.displayBookInfo();
    }
}
