package library;
import library.books.Book;
import library.members.Member;
import library.transactions.Transaction;
import java.util.Scanner;
class MainClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("--- Add a New Book ---");
        System.out.print("Enter Book Title: ");
        String bTitle = sc.nextLine();
        System.out.print("Enter Author: ");
        String bAuthor = sc.nextLine();
        System.out.print("Enter ISBN: ");
        String bISBN = sc.nextLine();

        Book book = new Book();
        book.setBook(bTitle, bAuthor, bISBN);

        System.out.println("\n--- Register a New Member ---");
        System.out.print("Enter Member Name: ");
        String mName = sc.nextLine();
        System.out.print("Enter Member ID: ");
        int mID = sc.nextInt();
        sc.nextLine();

        Member member = new Member();
        member.setMember(mName, mID);

        Transaction trans = new Transaction();
        trans.issueBook(book, member);

        System.out.println("\n--- Book Details ---");
        book.displayBook();

        System.out.println("\n--- Member Details ---");
        member.displayMember();

        System.out.println("\n--- Transaction Details ---");
        trans.displayTransaction();

        sc.close();
    }
}
