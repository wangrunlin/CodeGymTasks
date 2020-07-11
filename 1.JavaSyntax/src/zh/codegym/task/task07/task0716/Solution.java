package zh.codegym.task.task07.task0716;

import java.util.ArrayList;

/* 
R 或 L
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("rose"); // 0
        list.add("love"); // 1
        list.add("lyre"); // 2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if (s.contains("r") && !s.contains("l")) {
                list.remove(i);
                i--;
            }
            else if (!s.contains("r") && s.contains("l")) {
                list.add(i, s);
                i++;
            }
        }
        return list;
    }
}