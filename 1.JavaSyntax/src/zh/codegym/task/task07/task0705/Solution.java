package zh.codegym.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
一个大数组和两个小数组
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] num = new int[20];
        int[] small1 = new int[10];
        int[] small2 = new int[10];

//        int i = 0;
//        num[i] = Integer.parseInt(reader.readLine());
//        if (i < 10)
//            small1[i] = num[i];
//        if (i >= 10 && i < 20 )
//            small2[i] = num[i];


        for (int i = 0; i < 20; i++) {
            num[i] = Integer.parseInt(reader.readLine());
            if (i < 10) {
                small1[i] = num[i];
            }
            if (i >= 10 && i < 20 ) {
                int j = i - 10;
                small2[j] = num[i];
            }
        }

        for (int n : small2)
            System.out.println(n);

    }
}
