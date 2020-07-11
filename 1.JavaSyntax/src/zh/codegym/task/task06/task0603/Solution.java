package zh.codegym.task.task06.task0603;

/* 
Cat 和 Dog 对象：各有 50000 个对象
*/

public class Solution {
    public static void main(String[] args) {
        for (int i = 0; i < 50000; i++) {
            Cat cat = new Cat();
            Dog dog = new Dog();
            cat = null;
            dog = null;
        }
    }
}

class Cat {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("一个 Cat 被销毁");
    }
}

class Dog {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("一个 Dog 被销毁");
    }
}
