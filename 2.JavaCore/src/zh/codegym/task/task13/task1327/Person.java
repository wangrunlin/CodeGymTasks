package zh.codegym.task.task13.task1327;

public class Person implements TurnipItem {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void pull(Person second) {
//        System.out.println(this.name + "在" + second.getName() + "后面");
//        此处 "后面" 测试不通过
        System.out.println(this.name + "在" + second.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

