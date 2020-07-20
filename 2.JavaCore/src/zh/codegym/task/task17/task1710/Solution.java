package zh.codegym.task.task17.task1710;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
CRUD
*/

public class Solution {

    public static List<Person> allPeople = new ArrayList<>();

    static {
        allPeople.add(Person.createMale("唐纳德·坎普", new Date()));  // id=0
        allPeople.add(Person.createMale("拉里·盖茨", new Date()));  // id=1
    }

    public static void main(String[] args) {
        // 在这里开始
    }
}
