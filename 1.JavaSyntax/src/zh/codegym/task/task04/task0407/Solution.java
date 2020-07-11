package zh.codegym.task.task04.task0407;

/* 
宇宙中的猫
*/

public class Solution {

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat.count++;

        Cat cat2 = new Cat();
        Cat.count++;

        System.out.println("猫的计数为 " + Cat.count);
    }

    public static class Cat {
        public static int count = 0;
    }
}