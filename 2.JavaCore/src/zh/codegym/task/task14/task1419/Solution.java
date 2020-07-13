package zh.codegym.task.task14.task1419;

import java.util.ArrayList;
import java.util.List;

/* 
引入异常
*/

public class Solution {

    public static List<Exception> exceptions = new ArrayList<>();

    public static void main(String[] args) {
        initExceptions();
        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   // 第一个异常\
        // 算术条件异常。譬如：整数除零等。
        try {
            float i = 1 / 0;
        } catch (ArithmeticException e) {
            exceptions.add(e);
        }

        // 数组索引越界异常。当对数组的索引值为负数或大于等于数组大小时抛出。
        try {
            int[] n = new int[2];
            System.out.println(n[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            exceptions.add(e);
        }

        // 空指针异常。当应用试图在要求使用对象的地方使用了null时，抛出该异常。
        // 譬如：调用null对象的实例方法、访问null对象的属性、计算null对象的长度、使用throw语句抛出null等等。
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            exceptions.add(e);
        }

        // 数字格式异常。当试图将一个String转换为指定的数字类型，而该字符串确不满足数字类型要求的格式时，抛出该异常。
        try {
            String str = "a12";
            int n = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            exceptions.add(e);
        }

        // 字符串索引越界异常。当使用索引值访问某个字符串中的字符，而该索引值小于0或大于等于序列大小时，抛出该异常。
        try {
            String str = "a12";
            System.out.println(str.charAt(5));
        } catch (StringIndexOutOfBoundsException e) {
            exceptions.add(e);
        }

        // 数组大小为负值异常。当使用负数大小值创建数组时抛出该异常。
        try {
            int[] n = new int[-10];
        } catch (NegativeArraySizeException e) {
            exceptions.add(e);
        }

        exceptions.add(new MyException1());
        exceptions.add(new MyException2());
        exceptions.add(new MyException3());
        exceptions.add(new MyException5());

//        // 数组大小为负值异常。当使用负数大小值创建数组时抛出该异常。
//        try {
//            float i = 1 / 0;
//        } catch (Exception e) {
//            exceptions.add(e);
//        }


    }

    static class MyException1 extends Exception {}
    static class MyException2 extends Exception {}
    static class MyException3 extends Exception {}
    static class MyException5 extends Exception {}
}
