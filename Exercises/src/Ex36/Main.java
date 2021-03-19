package Ex36;

public class Main {
   private static Thread Jonas;
   private static Thread Algimantas;

    public static void main(String[] args) {

        Jonas = new Thread(new ThreadPlaygroundRunnable("Jonas"));

        Algimantas = new Thread(new ThreadPlaygroundRunnable("Algimannas"));
        Jonas.start();
        Algimantas.start();
    }
}
