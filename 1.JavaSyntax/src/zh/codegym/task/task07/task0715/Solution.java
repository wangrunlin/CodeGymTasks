package zh.codegym.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
又见“我是山姆”
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("山姆");
        list.add("火腿");
        list.add("我");
        list.add("火腿");
        list.add("是");
        list.add("火腿");

//        for (int i = 0; i < list.size(); i++) {
//            list.add(i, "火腿");
//        }

        for (String s : list)
            System.out.println(s);
    }
}
