package zh.codegym.task.task06.task0602;

/* 
僵尸猫和僵尸狗
*/

public class Cat {
    public static void main(String[] args) {

    }

    protected void finalize() throws Throwable {
        System.out.println("一个 Cat 被销毁");
    }

}

class Dog {

    protected void finalize() throws Throwable {
        System.out.println("一个 Dog 被销毁");
    }

}
