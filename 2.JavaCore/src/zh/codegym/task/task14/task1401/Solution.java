package zh.codegym.task.task14.task1401;

/* 
你成功了！
*/
 
public class Solution {
    public static void main(String[] args) {
        Object animal = new Tiger();
        boolean isCat = animal instanceof Cat;
        boolean isTiger = animal instanceof Tiger;
        boolean isPet = animal instanceof Pet;

        printResults(isCat, isTiger, isPet);
    }

    private static void printResults(boolean cat, boolean tiger, boolean pet) {
        if (cat && tiger && pet) System.out.println("你成功了！");
    }

    static class Pet {
    }

    static class Cat extends Pet {
    }

    static class Tiger extends Cat {
    }

}
