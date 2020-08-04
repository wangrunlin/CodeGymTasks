package zh.codegym.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
CRUD 2
*/

public class Solution {

    public static volatile List<Person> allPeople = new ArrayList<>();
    public static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM dd yyyy");

    static {
        allPeople.add(Person.createMale("唐纳德·坎普", new Date()));  // id=0
        allPeople.add(Person.createMale("拉里·盖茨", new Date()));  // id=1
    }

    public static void main(String[] args) {


//        if (args[0].equals("-c"))
//            create(args);
//        else if (args[0].equals("-u"))
//            update(args);
//        else if (args[0].equals("-d"))
//            delete(args);
//        else if (args[0].equals("-i"))
//            display(args);

//        switch (args[0]) {
//            case "-c":
//                for (int i = 1; i < args.length; i += 3) {
//                    String name = args[i];
//                    String sex = args[i + 1];
//                    String birthday = args[i + 2];
//                    Person person = createPerson(name, sex, birthday);
//                    /** 将 Person 对象添加到 allPeople 列表的末尾并显示 id（index）  */
//                    allPeople.add(person);
//                    System.out.println(allPeople.indexOf(person));
//                }
//                break;
//            case "-u":
//                for (int i = 1; i < args.length; i += 4) {
//                    int id = Integer.parseInt(args[i]);
//                    String name = args[i + 1];
//                    String sex = args[i + 2];
//                    String birthday = args[i + 3];
//                    /** 删除指定 id 的人员数据 */
//                    allPeople.remove(id);
//
//                    /** 更新对象 */
//                    Person person = createPerson(name, sex, birthday);
//
//                    /** 将 Person 对象添加到 allPeople 列表的指定 id  */
//                    allPeople.add(id, person);
//                }
//                break;
//            case "-d":
//                for (int i = 1; i < args.length; i++) {
//                    Person person = allPeople.get(Integer.parseInt(args[i]));
//                    person.setName(null);
//                    person.setSex(null);
//                    person.setBirthDate(null);
//                }
//                break;
//            case "-i":
//                for (int i = 1; i < args.length; i++) {
//                    System.out.println(allPeople.get(Integer.parseInt(args[i])));
//                }
//                break;
//        }

        /** 测试通过代码 */
        switch (args[0]) {
            case "-c":
                synchronized (allPeople) {
                    create(args);
                }
                break;
            case "-u":
                synchronized (allPeople) {
                    update(args);
                }
                break;
            case "-d":
                synchronized (allPeople) {
                    delete(args);
                }
                break;
            case "-i":
                synchronized (allPeople) {
                    display(args);
                }
                break;
        }
    }

    /**
     * -c （将具有指定参数的人员添加到 allPeople 的末尾；在屏幕上显示 id）
     */
    public static void create(String[] args) {
        int i = 1;
        while (i < args.length) {
            String name = args[i];
            String sex = args[i + 1];
            String birthday = args[i + 2];
            Person person = createPerson(name, sex, birthday);
            /** 将 Person 对象添加到 allPeople 列表的末尾并显示 id（index）  */
            allPeople.add(person);
            System.out.println(allPeople.indexOf(person));
            i += 3;
        }
    }

    /**
     * -u（更新具有指定 id 的人员数据）
     */
    public static void update(String[] args) {
        int i = 1;
        while (i < args.length) {
            int id = Integer.parseInt(args[i]);
            String name = args[i + 1];
            String sex = args[i + 2];
            String birthday = args[i + 3];
            /** 删除指定 id 的人员数据 */
            allPeople.remove(id);

            /** 更新对象 */
            Person person = createPerson(name, sex, birthday);

            /** 将 Person 对象添加到 allPeople 列表的指定 id  */
            allPeople.add(id, person);
            i += 4;
        }
    }

    /**
     * -d（对具有指定 id 的人员执行逻辑删除；将其所有数据替换为 null）
     */
    public static void delete(String[] args) {
        for (int i = 1; i < args.length; i++) {
            Person person = allPeople.get(Integer.parseInt(args[i]));
            person.setName(null);
            person.setSex(null);
            person.setBirthDate(null);
        }
    }

    /**
     * -i（显示具有指定 id 的人员的信息：姓名 性别 (m/f) 生日 (格式 Apr 15 1990)）
     */
    public static void display(String[] args) {
        for (int i = 1; i < args.length; i++) {
            System.out.println(allPeople.get(Integer.parseInt(args[i])));
        }
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
