package zh.codegym.task.task20.task2015;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* 
重写序列化
*/

public class Solution implements Serializable, Runnable {

    transient private Thread runner;
    private int speed;

    public Solution(int speed) {
        this.speed = speed;
        runner = new Thread(this);
        runner.start();
    }

    public void run() {
        System.out.println("speed: " + speed);
        for (int i = 1; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     重写序列化。
     为此，你需要声明下列方法：
     private void writeObject(ObjectOutputStream out) throws IOException
     private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException
     现在序列化/反序列化适用于我们的方案 :)
     */
    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        out.writeObject(this);
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException, CloneNotSupportedException {
        in.defaultReadObject();
        Thread thread = new Thread(this);
        thread.start();
    }

    public static void main(String[] args) {

    }
}
