public class main {
    public static void main(String[] args) {
        Pinger ping = new Pinger();
        Ponger pong = new Ponger();

        try {
            ping.start();
            pong.start();
            Thread.sleep(6000);
            ping.kill();
            pong.kill();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
