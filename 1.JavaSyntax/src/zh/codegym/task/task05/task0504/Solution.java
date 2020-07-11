package zh.codegym.task.task05.task0504;


/* 
三个“火枪手”
*/

public class Solution {
    public static void main(String[] args) {
        Cat cat1 = new Cat("小花猫", 2, 3, 1);
        Cat cat2 = new Cat("小花猫", 2, 3, 1);
        Cat cat3 = new Cat("小花猫", 2, 3, 1);
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}