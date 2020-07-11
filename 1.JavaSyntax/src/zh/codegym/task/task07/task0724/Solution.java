package zh.codegym.task.task07.task0724;

/* 
家庭人口普查
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Human> list = new ArrayList<Human>();

        for (int i = 0; i < 4; i++) {
            Human human = new Human("human", true, 45);
            list.add(human);
        }

        for (int i = 0; i < 5; i++) {
            Human human1 = new Human("name", false, 19, list.get(i), list.get(i + 1));
            list.add(human1);
        }

        for (Human h : list)
            System.out.println(h.toString());
    }

    public static class Human {
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this(name, sex, age);
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "名字：" + this.name;
            text += "，性别：" + (this.sex ? "男" : "女");
            text += "，年龄：" + this.age;

            if (this.father != null)
                text += "，父亲：" + this.father.name;

            if (this.mother != null)
                text += "，母亲：" + this.mother.name;

            return text;
        }
    }
}