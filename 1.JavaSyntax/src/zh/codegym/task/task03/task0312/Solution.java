package zh.codegym.task.task03.task0312;

/* 
时间转换
*/

public class Solution {
    public static int convertToSeconds(int hour) {

        return hour * 3600;
    }

    public static void main(String[] args) {
        System.out.println(convertToSeconds(15));
        System.out.println(convertToSeconds(21));
    }
}
