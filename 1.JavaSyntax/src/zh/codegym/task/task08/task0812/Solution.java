package zh.codegym.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
最长序列
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }

        System.out.println(longest(list));
    }

    public static int longest(List<Integer> list) {
        int [] max = new int[list.size()];
        int n = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            max[i] = 1;
            if (list.get(i + 1).equals(list.get(i))) {
                max[n] += 1;
            }
            else
                n++;
        }

        return arrayMax(max);
    }

    private static int arrayMax(int [] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }

        return max;
    }
}