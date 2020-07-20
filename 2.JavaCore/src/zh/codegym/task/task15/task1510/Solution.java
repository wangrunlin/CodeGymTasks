package zh.codegym.task.task15.task1510;

/* 
告别所有不必要的事物
*/

public class Solution {

    public static void main(String[] args) {
        add((short) 1, 2f);
        add(1, 2);
        add(2d, 2);
        add((byte) 1, 2d);
    }

    public static void add(int i, int j) {
        System.out.println("Integer 加法");
    }

    public static void add(int i, double j) {
        System.out.println("Integer 和 double 加法");
    }

    public static void add(double i, double j) {
        System.out.println("Double 加法");
    }
}
