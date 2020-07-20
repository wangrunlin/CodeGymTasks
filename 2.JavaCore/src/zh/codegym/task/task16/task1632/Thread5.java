package zh.codegym.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Thread5 extends Thread {

    private static long sum = 0;
    private static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    @Override
    public void run() {
        while (true) {
            try {
                String string = reader.readLine();
                if (string.equals("N")) {
                    System.out.println(sum);
                    break;
                }
                sum += Integer.parseInt(string);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
