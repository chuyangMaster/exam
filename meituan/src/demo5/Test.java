package demo5;

public class Test {
    public static void main(String[] args) {
        Sale sale = new Sale();
        Thread thread1 = new Thread(sale);
        Thread thread2 = new Thread(sale);

        thread1.start();
        thread2.start();
    }
}
