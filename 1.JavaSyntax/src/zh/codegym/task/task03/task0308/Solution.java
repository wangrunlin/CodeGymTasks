package zh.codegym.task.task03.task0308;

/* 
10 个数字的乘积
*/

public class Solution {
    public static void main(String[] args) {
        int sum = 1;
        for (int i = 1; i <= 10; i++) {
            sum *= i;
        }

        System.out.println(sum);
    }
}
