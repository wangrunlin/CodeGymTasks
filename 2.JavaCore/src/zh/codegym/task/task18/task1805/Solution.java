package zh.codegym.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/* 
对字节排序
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream inputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());

        HashMap<Integer, Integer> map = new HashMap<>();
        while (inputStream.available() > 0) {
            map.put(inputStream.read(), 1);
        }
        inputStream.close();

        ArrayList<Integer> list = new ArrayList<>();
        for (int n : map.keySet())
            list.add(n);

        Collections.sort(list);

        for (int n : list)
            System.out.print(n + " ");
    }
}
