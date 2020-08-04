package zh.codegym.task.task19.task1914;

/* 
问题解决
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        //在一个特殊变量中保存当前的 PrintStream
        PrintStream consoleStream = System.out;

        //创建动态数组
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        //创建 PrintStream 类的适配器
        PrintStream stream = new PrintStream(outputStream);
        //将其设置为当前的 System.out
        System.setOut(stream);

        //调用一个对我们的更改一无所知的函数
        testString.printSomething();

        //将写入 ByteArray 的数据转换为字符串
        String result = outputStream.toString();

        //将一切恢复原样
        System.setOut(consoleStream);

        System.out.println(toResult(result));
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }

    public static String toResult(String str) {
        str = str.trim();   // 去除换行符
        String[] split = str.split(" ");
        int result = 0;

        String operator = split[1];
        if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/") || operator.equals("%")) {
            int a = Integer.parseInt(split[0]);
            int b = Integer.parseInt(split[2]);
            switch (operator) {
                case "+" :
                    result = a + b; break;
                case "-" :
                    result = a - b; break;
                case "*" :
                    result = a * b; break;
                case "/" :
                    result = a / b; break;
                case "%" :
                    result = a % b; break;
            }
        }

        return str + " " + result;
    }
}

