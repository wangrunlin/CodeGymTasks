package zh.codegym.task.task05.task0517;

/* 
创建猫
*/

public class Cat {

    String name;
    int age;
    int weight;
    String address;
    String color;

    public Cat(String name) {
        this.name = name;
        age = weight = 1;
        color = "black";
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        color = "black";
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        weight = 1;
        color = "black";
    }

    public Cat(int weight, String color) {
        this.weight = weight;
        this.color = color;
        name = null;
        age = 1;
    }

    public Cat(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
        age = 1;
    }

    public static void main(String[] args) {

    }
}
