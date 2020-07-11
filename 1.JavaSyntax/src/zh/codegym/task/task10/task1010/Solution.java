package zh.codegym.task.task10.task1010;

/* 
正确答案：d = 1.0
*/

public class Solution {
    public static void main(String[] args) {
        int a = 257;
        int b = 4;
        int c = 3;
        int e = 2;
        double d = (byte) a + b / c / e;

        System.out.println(d);
    }
}
