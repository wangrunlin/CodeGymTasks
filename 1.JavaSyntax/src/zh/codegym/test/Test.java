package zh.codegym.test;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Dog()));
        System.out.println(getObjectType(new Whale()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
//        String typeName=o.getClass().getName();
        String typeName=o.getClass().getName().substring(o.getClass().getName().lastIndexOf("$")+1);
        if (typeName.equals("Cow"))
            return "奶牛";
        else if (typeName.equals("Dog"))
            return "狗";
        else if (typeName.equals("Whale"))
            return "鲸鱼";
        else
            return "未知动物";


//
//        return typeName.substring(typeName.lastIndexOf("$") + 1);
    }

    public static class Cow {
    }

    public static class Dog {
    }

    public static class Whale {
    }

    public static class Pig {
    }
}
