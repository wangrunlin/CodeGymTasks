package zh.codegym.task.task05.task0507;

/* 
算术平均值
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        float sum = 0;
        int num, i = 0;

        while (true) {
            num = Integer.parseInt(reader.readLine());

            if (num == -1)
                break;

            sum +=num;
            i++;
        }

        System.out.println(sum / i);
    }
}

