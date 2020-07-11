package zh.codegym.task.task04.task0410;

/* 
来吧，幸运七！
*/

public class Solution {

    public static void main(String[] args) {
        checkInterval(60);
        checkInterval(112);
        checkInterval(10);
    }

    public static void checkInterval(int a) {

        if (a >= 50 && a <= 100)
            System.out.println("数字 " + a + " 在此范围内。");
        else
            System.out.println("数字 " + a + " 不在此范围内。");
    }
}