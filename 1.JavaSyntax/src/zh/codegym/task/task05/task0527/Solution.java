package zh.codegym.task.task05.task0527;

/* 
汤姆和杰瑞
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("杰瑞", 12, 5);
        Cat Tom = new Cat("汤姆", 50, 9);
        Dog dog = new Dog("大黄", 80, 12);

    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Dog {
        String name;
        int height;
        int tail;

        public Dog(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Cat {
        String name;
        int height;
        int tail;

        public Cat(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }
}
