package zh.codegym.task.task13.task1309;

/* 
所有可移动之物
*/

public class Solution {
    public static void main(String[] args) {
    }

    interface CanMove {
        Double speed();
    }

    interface CanFly extends CanMove {
        Double speed(CanFly canFly);
    }
}