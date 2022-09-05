import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        BookStore realBook = new BookStore("Книжный магазин", new ArrayList<>());
        realBook.addBook("Java. Non-existent code", "Herbert Shildt", "Next Co", 2008, 432, 20.5f, "hardcover");
        realBook.addBook("Java. Complete guide", "Herbert Shildt", "Dialectrics", 2019, 1488, 22.5f, "hardcover");
        realBook.addBook("Java. Effective programming", "Joshua J. Bloch", "Sun", 2010, 294, 40.0f, "paperback");
        realBook.addBook("Object oriented programming in C ++", "Robert W. Lafore", "Peter", 2012, 928, 35.05f, "paperback");
        realBook.addBook("Java. Programming method", "Igor Blinov", "Four quarters. Minsk", 2013, 897, 28.5f, "paperback");



        System.out.println("books by Herbert Shildt at the realBook store:");
        ArrayList<Book> authorsBook = realBook.authorsBooks("HerbertShildt");
        for (Book book : authorsBook) {
            System.out.println(book);
        }



        System.out.println("\nbooks published by \"Dialectrics\":");
        ArrayList<Book> publishersBook = realBook.publishersBook("Dialectrics");
        for (Book book : publishersBook) {
            System.out.println(book);
        }

        System.out.println("\nbooks released after 2010:");
        ArrayList<Book> releasedAfter = realBook.releasedAfter(2010);
        for (Book book : releasedAfter) {
            System.out.println(book);
        }
    }
}