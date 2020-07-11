package zh.codegym.task.task05.task0502;

/* 
实现 fight 方法
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        if (anotherCat.age > this.age && anotherCat.weight > this.weight && anotherCat.strength > this.strength)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

    }
}
