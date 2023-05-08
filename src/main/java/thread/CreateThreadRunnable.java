package src.main.java.thread;

public class CreateThreadRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Runnable is interface");
    }

    public static void main(String[] args) {
        CreateThreadRunnable threadRunnable = new CreateThreadRunnable();
        threadRunnable.run();
        //create thread for this runnable
        Thread t = new Thread(threadRunnable);
        t.start();
        Thread t2 = new Thread(threadRunnable);
        t2.start();
        Thread t3 = new Thread(threadRunnable, "third thread");
        t3.start();
        System.out.println(t3.getName());
    }
}
