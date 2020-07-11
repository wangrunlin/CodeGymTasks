package zh.codegym.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
升序数字
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] num = new int[5];
        for (int i = 0; i < 5; i++) {
            num[i] = Integer.parseInt(reader.readLine());
        }

        Arrays.sort(num); // 排序
        // 排序后遍历数组
        for (int n : num)
            System.out.println(n);
    }
}
