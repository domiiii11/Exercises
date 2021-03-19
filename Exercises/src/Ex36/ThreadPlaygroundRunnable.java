package Ex36;

public class ThreadPlaygroundRunnable implements Runnable{

    private String name;

    public ThreadPlaygroundRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {

        for (int i= 0; i<10; i++){
            int s = i + 1;
            System.out.println(Thread.currentThread().getName() + " " + this.name + " " + s );
        }

    }
}
