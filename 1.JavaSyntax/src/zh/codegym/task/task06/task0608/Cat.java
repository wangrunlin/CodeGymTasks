package zh.codegym.task.task06.task0608;

/* 
猫的 static 方法
*/

public class Cat {
    private static int catCount = 0;

    public Cat() {
        catCount++;
    }

    public static int getCatCount() {
        return catCount;

    }

    public static void setCatCount(int catCount) {
        Cat.catCount = catCount;

    }

    public static void main(String[] args) {

    }
}
