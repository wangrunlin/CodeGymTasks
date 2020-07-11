package zh.codegym.task.task10.task1005;

/* 
任务 5 － 关于整数类型转换
*/

public class Solution {
    public static void main(String[] args) {
        int a = 44;
        int b = 300;
        short c = (short) (b - a);
        System.out.println(c);
    }
}