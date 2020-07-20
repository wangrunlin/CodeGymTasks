package zh.codegym.task.task16.task1632;

public class Thread3 extends Thread {
    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("加油");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
        }
    }
}
