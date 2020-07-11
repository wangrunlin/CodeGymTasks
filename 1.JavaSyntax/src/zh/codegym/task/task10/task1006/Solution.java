package zh.codegym.task.task10.task1006;

/* 
任务 6 － 关于整数类型转换
*/

public class Solution {

    public static void main(String[] args) {
        double d = (short) 2.50256e2d;
        char c = (short) 'd';
        short s = (short) 2.22;
        int i = 150000;
        float f = 0.50f;
        double result = f + (i / c) - (d * s) - 500e-3;
        System.out.println("结果: " + result);
    }
}