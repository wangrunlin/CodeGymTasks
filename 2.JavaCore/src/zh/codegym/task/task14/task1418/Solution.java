package zh.codegym.task.task14.task1418;

import java.util.LinkedList;
import java.util.List;

/* 
纠正四个错误
*/

public class Solution {

    public static void main(String[] args) {
//        List<Number> list = new LinkedList<>();
//        // 3
//        initList(list);
//        list.remove(new Double("123e-445632"));
//
//        // 4 - 更正 2 个错误
//        printListValues(list);
//
//        // 5
//        processCastObjects(list);
    }

    static void initList(List<Number> list) {
        for (int i = 0; i < 5; i++) {
            double d = Math.random();
            float f = (float) Math.random();
            list.add(d);
            list.add(f);
        }
    }

    static void printListValues(List<Number> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    static void processCastObjects(List<Number> list) {
        for (Number object : list) {
            // 更正 2 个错误
            if (object instanceof Float) {
                Float a = (Float) object;
                System.out.println("是否已定义 float？" + !(a.isNaN()));
            } else if (object instanceof Double) {
                Double a = (Double) object;
                System.out.println("是否已定义 double？" + a.isInfinite());
            }
        }
    }
}
