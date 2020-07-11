package zh.codegym.task.task10.task1002;

/* 
任务 2 － 关于整数类型转换
*/

public class Solution {
    public static void main(String[] args) {
        int a = 15;
        int b = 4;
        float c = (float) a / b;
        double d = a * 1e-3 + c;

        System.out.println(d);
    }
}
