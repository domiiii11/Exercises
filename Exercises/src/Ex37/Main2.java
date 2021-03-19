package Ex37;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main2 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
executor.submit(() -> {
     for (int i= 0; i<10; i++){
          int s = i + 1;
          System.out.println(Thread.currentThread().getName() + " " + " " + s );
}
    });

    //Create a class containing the standard static method main and a variable of type Executor and using the
    //factory method newFixedThreadPool of the Executors class to create a pool of 2 executors.
    //In iteration, add 10 ThreadPlaygroundRunnable objects from the previous task to the executor. Use any
    //string and current iteration number as the name.
}
}