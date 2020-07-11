package zh.codegym.task.task03.task0303;

/* 
货币兑换
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(15, 2.5));
        System.out.println(convertEurToUsd(20, 2.5));
    }

    public static double convertEurToUsd(int eur, double exchangeRate) {
        return eur * exchangeRate;
    }
}
