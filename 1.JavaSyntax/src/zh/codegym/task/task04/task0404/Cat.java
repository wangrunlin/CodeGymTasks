package zh.codegym.task.task04.task0404;

/* 
对猫进行登记
*/

public class Cat {
    private static int catCount = 0;

    public static void addNewCat() {
        catCount++;
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        addNewCat();
    }
}
