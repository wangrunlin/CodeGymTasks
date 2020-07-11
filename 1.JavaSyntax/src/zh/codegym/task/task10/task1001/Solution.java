package zh.codegym.task.task10.task1001;

/* 
任务 1 － 关于整数类型转换
*/

public class Solution {
    public static void main(String[] args) {
        int a = 0;
        int b = (byte) a + 46;
        byte c = (byte) (a * b);
        double f = (char) 1234.15;
        long d = (long) (a + f / c + b);

        System.out.println(d);
    }
}
