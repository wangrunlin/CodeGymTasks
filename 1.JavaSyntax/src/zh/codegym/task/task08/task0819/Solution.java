package zh.codegym.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
包含猫的集
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

//        /** 删除一个元素

        Iterator it = cats.iterator();
        int i = 0;
        while (it.hasNext()) {
            Cat cat = (Cat) it.next();
            if (i == 0)
                it.remove();
            i++;
        }
//        */

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> set = new HashSet<>();

        for (int i = 1; i <= 3; i++) {
            set.add(new Cat());
        }

        return set;
    }

    public static void printCats(Set<Cat> cats) {
        for (Cat cat : cats)
            System.out.println(cat);
    }

    public static class Cat {
    }
}
