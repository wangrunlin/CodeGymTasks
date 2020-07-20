package zh.codegym.task.task16.task1618;

/* 
另一个中断
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        TestThread test = new TestThread();
        test.start();

        Thread.sleep(3000);
        test.interrupt();
    }

    //在此编写你的代码
    public static class TestThread extends Thread {
        private int i = 1;
        @Override
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    System.out.println(i++);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    return;
                }
            }
        }
    }
}
