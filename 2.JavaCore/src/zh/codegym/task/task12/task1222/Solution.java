package zh.codegym.task.task12.task1222;

/* 
不再毛绒绒
*/

public class Solution {

    public static void main(String[] args) {
        Pet pet = new Cat();
        pet.setName("我毛绒绒的");

        System.out.println(pet.getName());
    }

    public static class Pet {

        protected String name;

        public Pet() {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }

    public static class Cat extends Pet {
        @Override
        public void setName(String name) {
            this.name = "我是一只猫";
        }
    }
}
