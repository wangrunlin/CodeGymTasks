package zh.codegym.task.task06.task0605;


import java.io.*;

/* 
控制体重
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(bis.readLine());
        double height = Double.parseDouble(bis.readLine());

        Body.calculateBMI(weight, height);
    }

    public static class Body {
        public static void calculateBMI(double weight, double height) {
            double x = weight / (height * height);

            if (x < 18.5)
                System.out.println("体重不足：BMI < 18.5");
            else if (x < 25)
                System.out.println("体重正常：18.5 <= BMI < 25");
            else if (x < 30)
                System.out.println("超重：25 <= BMI < 30");
            else if (x >= 30)
                System.out.println("肥胖：BMI >= 30");
        }
    }
}
