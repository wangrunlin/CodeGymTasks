package zh.codegym.task.task15.task1517;

/* 
Static 修饰符和异常
*/

public class Solution {

    public static int A = 0;

    static {
        float f = 1 / 0;
    }

    public static int B = 5;

    public static void main(String[] args) {
        System.out.println(B);
    }
}
