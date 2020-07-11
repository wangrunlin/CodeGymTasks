package zh.codegym.task.task12.task1221;

/* 
人人心中都住着一只猫...
*/

public class Solution {

    public static void main(String[] args) {
        Pet pet = new Cat();

        System.out.println(pet.getName());
    }

    public static class Pet {
        public String getName() {
            return "我毛绒绒的";
        }
    }

    public static class Cat extends Pet {
        @Override
        public String getName() {
            return "我是一只猫";
        }
    }
}
