package zh.codegym.task.task04.task0411;

/* 
泰若星球上的季节
*/

public class Solution {

    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int month) {
        if (month >= 1 && month <= 12) {
            if (month >= 3 && month <= 5)
                System.out.println("春季");
            else if (month >= 6 && month <= 8)
                System.out.println("夏季");
            else if (month >= 9 && month <= 11)
                System.out.println("秋季");
            else
                System.out.println("冬季");
        }
    }
}