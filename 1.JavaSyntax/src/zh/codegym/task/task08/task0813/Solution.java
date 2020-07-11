package zh.codegym.task.task08.task0813;

import java.util.Set;
import java.util.HashSet;

/* 
20 个以字母“L”开头的单词
*/

public class Solution {
    public static Set<String> createSet() {
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < 20; i++) {
            set.add("L" + (char) (i + 65));
        }
        return set;
    }

    public static void main(String[] args) {

    }
}
