package zh.codegym.task.task12.task1220;

/* 
Human 类以及 CanRun 和 CanSwim 接口
*/

public class Solution {

    public static void main(String[] args) {

    }

    public interface CanRun {
        void run();
    }

    public interface CanSwim {
        void swim();
    }

    public abstract class Human implements CanRun, CanSwim {
        
    }
}
