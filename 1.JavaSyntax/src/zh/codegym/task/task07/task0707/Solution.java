package zh.codegym.task.task07.task0707;

import java.util.ArrayList;

/* 
那是什么类型的列表？
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();

        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");

        System.out.println(list.size());
        for (String s : list)
            System.out.println(s);
    }
}
