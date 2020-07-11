package zh.codegym.task.task06.task0611;

/* 
StringHelper 类
*/

import java.util.Collections;

public class StringHelper {
    public static String multiply(String s) {
        String result = String.join("" ,Collections.nCopies(5, s));
//        for (int i = 0; i < 5; i++) {
//            result += s;
//        }
        return result;
    }

    public static String multiply(String s, int count) {
        String result = String.join("", Collections.nCopies(count, s));
//        for (int i = 0; i < count; i++) {
//            result += s;
//        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(multiply("Amigo"));
        System.out.println(multiply("wrl", 10));
//        System.out.println(String.join("", Collections.nCopies(3, "Amigo")));
    }
}
