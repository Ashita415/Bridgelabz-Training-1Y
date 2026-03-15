package library.transactions;

import library.books.Book;
import library.members.Member;

public class Transaction {

    private Book book;
    private Member member;
    private String status;

    public void issueBook(Book b, Member m) {
        book = b;
        member = m;
        status = "Issued";
    }

    public void displayTransaction() {
        System.out.println("Book: " + book.getTitle());
        System.out.println("Issued To: " + member.getName() + " (ID: " + member.getMemberId() + ")");
        System.out.println("Status: " + status);
    }
}
