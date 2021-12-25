package com.codegym.task.task21.task2113;

/**
 * 马
 *
 * @author Leo Wang
 * @since 2021/12/26
 */
public class Horse implements Comparable {

    /**
     * 名称
     */
    private String name;

    /**
     * 速度
     */
    private double speed;

    /**
     * 距离
     */
    private double distance;

    public Horse(String name, double speed, double distance) {
        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    /**
     * 移动
     */
    public void move() {
        distance += speed * Math.random();
    }

    /**
     * 打印
     */
    public void print() {
        for (int i = 0; i < (int) distance; i++) {
            System.out.print(".");
        }

        System.out.println(name);
    }

    @Override
    public int compareTo(Object obj) {
        if (obj == null || obj.getClass() != this.getClass())
            return 0;

        Horse horse = (Horse) obj;

        return (int) (this.distance - horse.distance);
    }
}
