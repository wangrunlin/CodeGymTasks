package zh.codegym.task.task15.task1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

/* 
阶乘
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        BigDecimal result = new BigDecimal(1);
        if (n < 0)
            return Integer.toString(0);
//        else if (n == 0)
//            return "0! = 1";
        else {
            for (int i = 2; i <= n; i++) {
                result = result.multiply(new BigDecimal(i));
            }
        }
        return result.toString();
    }
}
