package zh.codegym.task.task04.task0409;

/* 
最接近 10
*/

public class Solution {
    public static void main(String[] args) {
        displayClosestToTen(8, 11);
        displayClosestToTen(7, 14);
    }

    public static void displayClosestToTen(int a, int b) {

        System.out.println(abs(a - 10) < abs(b - 10) ? a : b);

    }

    public static int abs(int a) {

        return a < 0 ? -a : a;

    }
}