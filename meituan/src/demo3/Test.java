package demo3;

public class Test {
    public static void main(String[] args) {
        Borrower borrower = new Borrower();
        try {
            borrower.borrow(20);
            borrower.borrow(30);
            borrower.borrow(15);
        } catch (NoBookException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());;
        }
    }
}
