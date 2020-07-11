package zh.codegym.task.task06.task0613;

/* 
Cat 和 static
*/

public class Solution {
    public static void main(String[] args) {
        // 创建 10 个 Cat 对象
        for (int i = 0; i < 10; i++) {
            Cat cat = new Cat();
        }

        System.out.println(Cat.catCount);
    }

    public static class Cat {
        static public int catCount = 0;

        public Cat() {
            catCount++;
        }
    }
}
