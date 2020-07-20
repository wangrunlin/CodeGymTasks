package zh.codegym.task.task16.task1632;

public class Thread2 extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("InterruptedException");
        }
    }
}
