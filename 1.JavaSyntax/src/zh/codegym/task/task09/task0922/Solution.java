package zh.codegym.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
今天是几号？
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(reader.readLine());
        // 输入日期并格式化

        sdf = new SimpleDateFormat("MMM dd, yyyy");
        System.out.println(sdf.format(date.getTime()).toUpperCase());
        // 重新格式化日期并输出
    }
}
