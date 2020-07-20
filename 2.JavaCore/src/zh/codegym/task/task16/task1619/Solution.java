package zh.codegym.task.task16.task1619;

/* 
无中断，没门？
*/

public class Solution {

    private static boolean isCurrentThreadInterrupted = false;

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new TestThread());
        t.start();
        Thread.sleep(3000);
        ourInterrupt();
    }

    public static void ourInterrupt() {
        isCurrentThreadInterrupted = true;
    }

    public static class TestThread implements Runnable {
        public void run() {
            while (!isCurrentThreadInterrupted) {
                try {
                    System.out.println("呵呵");
                    Thread.sleep(500);
                } catch (InterruptedException ignored) {
                }
            }
        }
    }
}
