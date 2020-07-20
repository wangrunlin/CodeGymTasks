package zh.codegym.task.task16.task1621;

/* 
Thread.currentThread 始终返回当前线程
*/

public class Solution {

    static int count = 5;

    public static void main(String[] args) {
        ThreadNamePrinter tnp = new ThreadNamePrinter();
        tnp.start();
        for (int i = 0; i < count; i++) {
            tnp.printMsg();
        }
    }

    public static class ThreadNamePrinter extends Thread {
        public void run() {
            for (int i = 0; i < count; i++) {
                printMsg();
            }
        }

        public void printMsg() {
            Thread t = Thread.currentThread(); // 应将当前线程赋值给变量 t
            String name = t.getName();
            System.out.println("名称=" + name);

            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
