package zh.codegym.task.task01.task0132;

/* 
三位数的数字和
*/

public class Solution {
    public static void main(String[] args) {

        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int sum = (number % 10) + (number / 10 % 10) + (number / 100);

        return sum;
    }
}