package src.main.java.thread;

public class CreateThread extends Thread{

    @Override
    public void run() {
        super.run();
        System.out.println("Start thread ...");
    }

    public static void main(String[] args) {
        CreateThread thread = new CreateThread();
        thread.start();
    }

}
