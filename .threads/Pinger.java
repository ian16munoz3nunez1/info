import java.lang.Runnable;
import java.lang.Exception;

public class Pinger extends Thread {
    private boolean killed = false;

    public Pinger() {
    }

    @Override
    public void run() {
        try {
            int i = 1;
            while(!killed) {
                System.out.println(i + ". ping");
                Thread.sleep(1000);
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void kill() {
        killed = true;
        System.out.println("Pinger killed");
    }
}

