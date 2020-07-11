package zh.codegym.task.task06.task0606;

import java.io.*;

/* 
偶数和奇数
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        while(true) {
            if (n == 0)
                break; // 循环退出条件
            int temp = n % 10; // 取输入数字的个位数
            if (temp % 2 == 0)
                even++;
            else
                odd++;
            n /= 10;
        }

        System.out.println("偶数：" + even +" 奇数：" + odd);

    }
}
