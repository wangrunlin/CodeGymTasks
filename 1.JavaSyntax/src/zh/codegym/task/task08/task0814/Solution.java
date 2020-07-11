package zh.codegym.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
大于 10？你不适合我们
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 1; i <= 20; i++) {
            set.add(i);
        }

        return set;
    }

    public static HashSet<Integer> removeAllNumbersGreaterThan10(HashSet<Integer> set) {
        Iterator<Integer> iter = set.iterator();

        while (iter.hasNext()) {
            if (iter.next() > 10)
                iter.remove();
        }

        return set;
    }

    public static void main(String[] args) {

    }
}
