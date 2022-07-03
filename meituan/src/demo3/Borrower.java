package demo3;

public class Borrower {
    public void borrow(int index) throws NoBookException {
        if(index > 25){
            throw new NoBookException("无此书");
        }
    }
}
