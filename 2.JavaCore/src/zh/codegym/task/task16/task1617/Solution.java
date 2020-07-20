package zh.codegym.task.task16.task1617;

/* 
比赛倒计时
*/

public class Solution {

    public static volatile int numSeconds = 3;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();

        Thread.sleep(3500);
        clock.interrupt();
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            /**
             * sleep() 方法在执行时会进行 isInterrupted 的判断
             * 并且线程终止后会抛出一个 InterruptedException 的异常
             * !    没有人可以保证线程将被停止。线程只能自行停止
             */
            while (true) {
                try {
                    if (numSeconds > 0) {
                        System.out.print(numSeconds + " ");
                        numSeconds--;
                    } else {
                        System.out.println("跑！");
                        return;
                    }
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("已中断！");
                    return;
                }
            }
        }
    }
}
