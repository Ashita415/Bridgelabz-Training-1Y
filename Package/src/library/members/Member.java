package library.members;

public class Member {

    private String name;
    private int memberId;

    public void setMember(String n, int id) {
        name = n;
        memberId = id;
    }

    public void displayMember() {
        System.out.println("Member Name: " + name);
        System.out.println("Member ID: " + memberId);
    }

    public String getName() {
        return name;
    }

    public int getMemberId() {
        return memberId;
    }
}