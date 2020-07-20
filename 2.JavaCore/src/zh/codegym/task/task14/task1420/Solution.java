package zh.codegym.task.task14.task1420;

/* 
最大公约数 (GCD)
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int a = Integer.parseInt(reader.readLine());
            int b = Integer.parseInt(reader.readLine());

            if (a > 0 && b > 0) {
                System.out.println(isGreatestCommonDivisor(a, b));
            } else
                throw new Exception();
        } catch (NumberFormatException e) {
            throw e;
        }

    }

    public static int isGreatestCommonDivisor(int a, int b) {
        int result = 1;
        int max = Math.max(a, b) / 2;

        for (int i = 2; i <= max; i++) {
            if (a % i == 0 && b % i == 0)
                result = i;
        }

        return result;
    }
}
