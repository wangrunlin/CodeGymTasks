package zh.codegym.task.task10.task1003;

/* 
任务 3 － 关于整数类型转换
*/

public class Solution {
    public static void main(String[] args) {
        float f = (float) 128.50;
        int i = (byte) f;
        int b = (int) (i + f);
        System.out.println(b);
    }
}
