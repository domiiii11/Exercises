package Ex35;

public class MyRunnable implements Runnable{

    @Override
    public void run() {
        displayName();
    }

    public static void displayName() {
        System.out.println(Thread.currentThread().getName());
    }
}
