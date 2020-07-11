package zh.codegym.task.task08.task0824;

/* 
构建家庭
*/

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<Human> list = new ArrayList<>();
        ArrayList<Human> children_list = new ArrayList<>();
        ArrayList<Human> children_list2 = new ArrayList<Human>();

        // 创建三个孩子 Human 对象
        for (int i = 1; i <= 3; i++)
            children_list.add(new Human("children" + i, i % 2 == 0, i + 10));

//        list.addAll(children_list);

        // 创建一个父亲一个母亲
        Human father = new Human("father", true, 35, children_list);
        Human mother = new Human("mother", false, 32, children_list);
        children_list2.add(father);
        children_list2.add(mother);

        // 创建两个祖父，祖母
        for (int i = 0; i < 2; i++) {
            Human grandfather = new Human("grandfather" + (i + 1), true, 60+i,new ArrayList<Human>(){{add(father);}});
            Human grandmother = new Human("grandmother" + (i + 1), false, 60+i-2, new ArrayList<Human>(){{add(father);}});
            list.add(grandfather);
            list.add(grandmother);
        }

        list.addAll(children_list2);
        list.addAll(children_list);

        for (Human human : list)
            System.out.println(human);

    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "名字：" + this.name;
            text += "，性别：" + (this.sex ? "男" : "女");
            text += "，年龄：" + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += "，孩子：" + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += "，" + child.name;
                }
            }
            return text;
        }
    }

}
