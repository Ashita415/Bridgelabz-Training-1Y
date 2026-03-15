package library.books;

public class Book {

    private String title;
    private String author;
    private String isbn;

    public void setBook(String t, String a, String i) {
        title = t;
        author = a;
        isbn = i;
    }

    public void displayBook() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }

    public String getTitle() {
        return title;
    }
}
