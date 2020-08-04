package zh.codegym.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
CRUD
*/

public class Solution {

    public static List<Person> allPeople = new ArrayList<>();
    public static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM dd yyyy");

    static {
        allPeople.add(Person.createMale("唐纳德·坎普", new Date()));  // id=0
        allPeople.add(Person.createMale("拉里·盖茨", new Date()));  // id=1
    }

    public static void main(String[] args) {

        if (args[0].equals("-c"))
            create(args[1], args[2], args[3]);
        else if (args[0].equals("-u"))
            update(Integer.parseInt(args[1]), args[2], args[3], args[4]);
        else if (args[0].equals("-d"))
            delete(Integer.parseInt(args[1]));
        else if (args[0].equals("-i"))
            display(Integer.parseInt(args[1]));

    }

    /**
     * -c （将具有指定参数的人员添加到 allPeople 的末尾；在屏幕上显示 id）
     */
    public static void create(String name, String sex, String birthday) {
        Person person = createPerson(name, sex, birthday);

        /** 将 Person 对象添加到 allPeople 列表的末尾并显示 id（index）  */
        allPeople.add(person);
        System.out.println(allPeople.indexOf(person));
    }

    /**
     * -u（更新具有指定 id 的人员数据）
     */
    public static void update(int id, String name, String sex, String birthday) {
        /** 删除指定 id 的人员数据 */
        allPeople.remove(id);

        /** 更新对象 */
        Person person = createPerson(name, sex, birthday);

        /** 将 Person 对象添加到 allPeople 列表的指定 id  */
        allPeople.add(id, person);
    }

    /**
     * -d（对具有指定 id 的人员执行逻辑删除；将其所有数据替换为 null）
     */
    public static void delete(int id) {
        Person person = allPeople.get(id);
        person.setName(null);
        person.setSex(null);
        person.setBirthDate(null);
    }

    /**
     * -i（显示具有指定 id 的人员的信息：姓名 性别 (m/f) 生日 (格式 Apr 15 1990)）
     */
    public static void display(int id) {
        System.out.println(allPeople.get(id));
    }

    /**
     * 创建一个 Person 对象 并转化性别和生日
     */
    private static Person createPerson(String name, String sex, String birthday) {
        Person person = null;
        /** 初始化对应性别的 Person 对象 */
        Date date = null;
        try {
            date = simpleDateFormat.parse(birthday);
        } catch (ParseException e) {
        }
        if (sex.equals("m"))
            person = Person.createMale(name, date);
        else if (sex.equals("f"))
            person = Person.createFemale(name, date);

        return person;
    }
}
