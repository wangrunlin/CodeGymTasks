package zh.codegym.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
街道和房屋
*/

public class Solution {

    static int even = 0, odd = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] num = new int[15];

        for (int i = 0; i < 15; i++) {
            num[i] = Integer.parseInt(reader.readLine());
            if (i % 2 == 0)
                even += num[i];
            else
                odd += num[i];
        }

        System.out.println(even > odd ? "居住在门牌号为偶数的房屋的居民更多。" : "居住在门牌号为奇数的房屋的居民更多。");

    }
}
