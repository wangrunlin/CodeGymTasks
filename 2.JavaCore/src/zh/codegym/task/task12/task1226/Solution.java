package zh.codegym.task.task12.task1226;

/* 
爬、飞行和跑
*/

public class Solution {

    public static void main(String[] args) {

    }

    public class Cat implements CanRun, CanClimb {
        @Override
        public void climb() {

        }

        @Override
        public void run() {

        }
    }

    public class Dog implements CanRun {
        @Override
        public void run() {

        }
    }

    public class Tiger extends Cat {
    }

    public class Duck implements CanRun, CanFly {
        @Override
        public void fly() {

        }

        @Override
        public void run() {

        }
    }

    interface CanFly {
        void fly();
    }

    interface CanClimb {
        void climb();
    }

    interface CanRun {
        void run();
    }
}
