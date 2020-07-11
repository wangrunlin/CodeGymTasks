package zh.codegym.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
玩 Javarella
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<Integer>();

        for (int i = 0; i < 20; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }   // 添加 20 个数字到 list 数组

        for (int n : list) {
            if (n % 3 == 0 && n % 2 == 0) {
                list1.add(n);
                list2.add(n);
            }   // 如果 n 能同时被 3 和 2 整除，则添加到列表 1 2
            else if (n % 3 == 0)
                list1.add(n);   // 如果 n 能够被 3 整除，则添加到列表1
            else if (n % 2 == 0)
                list2.add(n);   // 如果 n 能够被 2 整除，则添加到列表2
            else
                list3.add(n);   // 如果 n 不满足以上条件，则添加到列表3
        }

        printList(list1);
        printList(list2);
        printList(list3);
        // 显示3个补充列表
    }

    public static void printList(List<Integer> list) {
        for (int n : list)
            System.out.println(n);
    }   // 遍历列表
}
