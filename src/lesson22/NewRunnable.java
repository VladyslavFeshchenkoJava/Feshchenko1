package lesson22;

public class NewRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            Thread thread = Thread.currentThread();
            if (i % 10 == 0) {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                System.out.println(i + " " + thread.getName());
            }
        }
    }
}