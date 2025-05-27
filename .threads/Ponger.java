import java.lang.Runnable;
import java.lang.Exception;

public class Ponger extends Thread {
    private boolean killed = false;

    public Ponger() {
    }

    @Override
    public void run() {
        try {
            int i = 1;
            while(!killed) {
                System.out.println(i + ". pong");
                Thread.sleep(2000);
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void kill() {
        killed = true;
        System.out.println("Ponger killed");
    }
}

