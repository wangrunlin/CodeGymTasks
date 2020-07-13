package zh.codegym.task.task14.task1404;

/* 
猫
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Cat> list = new ArrayList<>();
        while (true) {
            String name = reader.readLine();
            if (name.isEmpty()) break;      // 输入空字符串后，停止读取数据
            list.add(CatFactory.getCatByKey(name));
        }

        for (Cat cat : list)
            System.out.println(cat);
    }

    static class CatFactory {
        static Cat getCatByKey(String key) {
            Cat cat = null;
            if ("凶爪".equals(key)) {
                cat = new MeanCat("利爪");
            } else if ("米斯".equals(key)) {
                cat = new NiceCat("米西");
            } else if ("斯马奇".equals(key)) {
                cat = new NiceCat("斯马戈");
            } else {
                cat = new Cat(key);
            }
            return cat;
        }
    }

    static class Cat {

        private String name;

        protected Cat(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public String toString() {
            return "我是" + getName() + "，一只小巷猫";
        }
    }

    static class MeanCat extends Cat {
        MeanCat(String name) {
            super(name);
        }

        public String toString() {
            return "我是" + getName() + "，我要挖掉你的眼睛";
        }
    }

    static class NiceCat extends Cat {
        NiceCat(String name) {
            super(name);
        }

        public String toString() {
            return "我是一只可爱的小猫，我叫" + getName();
        }
    }
}
