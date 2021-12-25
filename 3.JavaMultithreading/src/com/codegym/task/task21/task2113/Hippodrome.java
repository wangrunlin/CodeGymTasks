package com.codegym.task.task21.task2113;

import java.util.Arrays;
import java.util.List;

/**
 * 竞技场
 *
 * @author Leo Wang
 * @since 2021/12/26
 */
public class Hippodrome {

    /**
     * 马匹列表
     */
    private final List<Horse> horses;

    /**
     * 游戏实例
     */
    static Hippodrome game;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    /**
     * 移动
     */
    public void move() {
        horses.forEach(Horse::move);
    }

    /**
     * 打印
     */
    public void print() {
        horses.forEach(Horse::print);
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    public Horse getWinner() {
        return horses.stream().max((Horse::compareTo)).get();
    }

    public void printWinner() {
        System.out.println("The winner is " + getWinner().getName() + "!");
    }

    public static void main(String[] args) {
        List<Horse> horses = Arrays.asList(
                new Horse("Slevin", 3, 0),
                new Horse("Lucky", 3, 0),
                new Horse("Homer", 3, 0)
        );

        game = new Hippodrome(horses);

        game.run();

        game.printWinner();
    }

}
