package zh.codegym.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
掌握 static 块
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(result.getClass().getName());
    }
    
    static {
        CanFly result = null;
        reset();
    }

    public static CanFly result;

    public static void reset() {
        // 从控制台读取 String
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        try {
            str = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        /**
         * 读取字符串
         * 如果满足条件则 初始化相应字段
         */

        if (str.equals("helicopter"))
            result = new Helicopter();
        else if (str.equals("plane")) {
            int n = 0;
            try {
                n = Integer.parseInt(reader.readLine());
                reader.close();
            } catch (Exception e) {
                result = new Plane(n);
            }
            result = new Plane(n);
        }
    }
}
