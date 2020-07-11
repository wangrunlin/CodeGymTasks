package zh.codegym.task.task04.task0441;


/* 
设法达到均衡
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int max = Math.max(Math.max(a, b), c);
        int min = Math.min(Math.min(a, b), c);
        System.out.println(a + b + c - max - min);

    }
}
