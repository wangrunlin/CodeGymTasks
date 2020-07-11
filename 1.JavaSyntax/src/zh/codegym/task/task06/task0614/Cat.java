package zh.codegym.task.task06.task0614;

import java.util.ArrayList;

/* 
static 猫
*/

public class Cat {
    public static ArrayList<Cat> cats = new ArrayList<>();

    public Cat() {
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Cat cat = new Cat();
            cats.add(cat);
        }
        printCats();
    }

    public static void printCats() {
        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }
}
