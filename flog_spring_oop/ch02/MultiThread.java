package flog_spring_oop.ch02;

public class MultiThread extends Thread{
    static int share;

    public static void main(String[] args) {
        MultiThread t1 = new MultiThread();
        MultiThread t2 = new MultiThread();

        t1.start();
        t2.start();
    }

    public void run() {
        for(int count = 0; count < 10; count++) {
            System.out.println(share++);

            try { sleep(1000); }
            catch (InterruptedException e) {}
        }
    }
}
