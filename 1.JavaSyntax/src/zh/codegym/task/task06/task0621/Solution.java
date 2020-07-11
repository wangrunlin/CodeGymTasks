package zh.codegym.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
猫之间的关系
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandfatherName = reader.readLine();
        Cat catGrandfather = new Cat(grandfatherName);

        String grandmotherName = reader.readLine();
        Cat catGrandmother = new Cat(grandmotherName);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, null, catGrandfather);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catGrandmother, null);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMother, catFather);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catFather);

        System.out.println(catGrandfather);
        System.out.println(catGrandmother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {

        private String name;
        private Cat father;
        private Cat mother;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat mother, Cat father) {
            this.name = name;
            this.mother = mother;
            this.father = father;
        }

        //猫的名字为祖父泰格，无母亲，无父亲

        /**
         * 猫的名字为祖父泰格，无母亲，无父亲
         * 猫的名字为外祖母普斯，无母亲，无父亲
         * 猫的名字为父亲奥斯卡，无母亲，祖父泰格是父亲
         * 猫的名字为母亲米西，外祖母普斯是母亲，无父亲
         * 猫的名字为儿子辛巴，母亲米西是母亲，父亲奥斯卡是父亲
         * 猫的名字为女儿可可，母亲米西是母亲，父亲奥斯卡是父亲
         * @author Mr.lin
         * 猫的名字为祖父泰格，无母亲，无父亲
         * 猫的名字为外祖母普斯，无母亲，无父亲
         * 猫的名字为父亲奥斯卡，无母亲，祖父泰格是父亲
         * 猫的名字为母亲米西，外祖母普斯是母亲，无父亲
         * 猫的名字为儿子辛巴，母亲米西是母亲，父亲奥斯卡是父亲
         * 猫的名字为女儿可可，母亲米西是母亲，父亲奥斯卡是父亲
         */

        @Override
        public String toString() {
            if (mother == null)
                if (father == null)
                    return "猫的名字为" + name + "，无母亲，无父亲";
                else
                    return "猫的名字为" + name + "，无母亲，" + father.name + "是父亲";
            else
                if (father == null)
                    return "猫的名字为" + name + "，" + mother.name + "是母亲，无父亲";
                else
                    return "猫的名字为" + name + "，" + mother.name + "是母亲，" + father.name + "是父亲";
        }
    }

}
