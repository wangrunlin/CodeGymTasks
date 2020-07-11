package zh.codegym.task.task09.task0906;

/* 
记录堆栈跟踪
*/

public class Solution {
    public static void main(String[] args) {
        log("在 main 方法中");
    }

    public static void log(String s) {
        System.out.println(Thread.currentThread().getStackTrace()[2].getClassName() + ": " + Thread.currentThread().getStackTrace()[2].getMethodName() + ": " + s);
    }
}
