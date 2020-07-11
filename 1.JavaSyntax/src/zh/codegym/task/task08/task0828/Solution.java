package zh.codegym.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
月份编号
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String[] month = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(month));
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String m = reader.readLine();

        //May 是第 5 个月
        for (int i = 0; i < list.size(); i++) {
            if (m.equals(list.get(i)))
                System.out.println(list.get(i) + " 是第 " + (i+1) + " 个月");
        }

    }
}
