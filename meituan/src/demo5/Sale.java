package demo5;

public class Sale implements Runnable{
    int ticket = 100;
    final String lock = "";

    @Override
    public void run() {
        while(true){
            synchronized (lock){
                if(ticket > 0){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票");
                    ticket--;
                }else{
                    break;
                }
            }
        }
    }
}
