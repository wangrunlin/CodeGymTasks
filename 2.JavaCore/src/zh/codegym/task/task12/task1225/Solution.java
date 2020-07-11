package zh.codegym.task.task12.task1225;

/* 
参观者
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Animal()));
    }

    public static String getObjectType(Object o) {
        if (o instanceof Tiger)
            return "老虎";
        else if (o instanceof Lion)
            return "狮子";
        else if (o instanceof Cat)
            return "猫";
        else if (o instanceof Bull)
            return "公牛";
        else if (o instanceof Cow)
            return "奶牛";
        else if (o instanceof Animal)
            return "动物";
        return null;
    }

    public static class Cat extends Animal   // <-- 类继承！
    {
    }

    public static class Tiger extends Cat {
    }

    public static class Lion extends Cat {
    }

    public static class Bull extends Animal {
    }

    public static class Cow extends Animal {
    }

    public static class Animal {
    }
}
