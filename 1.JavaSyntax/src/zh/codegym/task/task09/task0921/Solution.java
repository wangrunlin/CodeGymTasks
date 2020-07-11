package zh.codegym.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
try-catch 中的方法
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        List<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            while (true)
                list.add(Integer.parseInt(reader.readLine()));
        } catch (IOException e) {
            printList(list);
        } catch (NumberFormatException e) {
            printList(list);
        }
    }

    public static void printList(List<Integer> list) {
        for (int n : list)
            System.out.println(n);
    }
}
