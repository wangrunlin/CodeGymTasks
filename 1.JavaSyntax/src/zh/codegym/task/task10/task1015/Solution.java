 package zh.codegym.task.task10.task1015;

import java.util.ArrayList;

/* 
字符串列表数组
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] list = new ArrayList[5];
        for (int i = 0; i < 5; i++) {
            list[i] = new ArrayList<>();
            list[i].add("" + i);
        }

        return list;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}