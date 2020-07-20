package zh.codegym.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
不同类型的不同方法
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String str = reader.readLine();
            if (str.equals("exit")) break;

            if (str.contains(".")) {
                try {
                    double d = Double.parseDouble(str);
                    print(d);
                } catch (NumberFormatException e) {
                    print(str);
                }
            } else {
                try {
                    int n = Integer.parseInt(str);
                    if (n > 0 && n < 128)
                        print((short) n);
                    else
                        print(n);
                } catch (NumberFormatException e) {
                    print(str);
                }
            }
        }

    }

    public static void print(Double value) {
        System.out.println("这是一个 Double。Value: " + value);
    }

    public static void print(String value) {
        System.out.println("这是一个 String。Value: " + value);
    }

    public static void print(short value) {
        System.out.println("这是一个 short。Value: " + value);
    }

    public static void print(Integer value) {
        System.out.println("这是一个 Integer。Value: " + value);
    }
}
