package zh.codegym.task.task09.task0907;

/* 
处理数字时发生异常
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        try {
            int a = 42 / 0;
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
