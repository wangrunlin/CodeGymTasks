package zh.codegym.task.task12.task1224;

/* 
未知动物
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        String typeName = o.getClass().getTypeName().substring(o.getClass().getName().lastIndexOf('$') + 1);

        if (typeName.equals("Cat"))
            return "猫";
        else if (typeName.equals("Tiger"))
            return "老虎";
        else if (typeName.equals("Lion"))
            return "狮子";
        else if (typeName.equals("Bull"))
            return "公牛";
        else
            return "动物";
    }

    public static class Cat {
    }

    public static class Tiger {
    }

    public static class Lion {
    }

    public static class Bull {
    }

    public static class Pig {
    }
}
