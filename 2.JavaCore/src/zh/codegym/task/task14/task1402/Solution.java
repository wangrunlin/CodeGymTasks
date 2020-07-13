package zh.codegym.task.task14.task1402;

/* 
你成功了！
*/

public class Solution {
    public static void main(String[] args) {
        Cat cat = new TomCat();

        boolean isCat = cat instanceof Cat;
        boolean isMovable = cat instanceof CanMove;
        boolean isTom = cat instanceof TomCat;

        if (isCat && isMovable && isTom) System.out.println("你成功了！");
    }

    interface CanMove {
    }

    static class Cat implements CanMove {
    }

    static class TomCat extends Cat {

    }
}
