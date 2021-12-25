package zh.codegym.task.task20.task2022;

import java.io.*;

/* 
在线程中重写序列化
*/

public class Solution implements Serializable, AutoCloseable {

    transient private FileOutputStream stream;

    public Solution(String fileName) throws FileNotFoundException {
        this.stream = new FileOutputStream(fileName);
    }

    public void writeObject(String string) throws IOException {
        stream.write(string.getBytes());
        stream.write("\n".getBytes());
        stream.flush();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
    }

    @Override
    public void close() throws Exception {
        System.out.println("正在全部关闭！");
        stream.close();
    }

    public static void main(String[] args) {
        try {
            Solution solution = new Solution("out.txt");
            solution.writeObject("test");

            ObjectInputStream in = new ObjectInputStream(new FileInputStream("out.txt"));
            solution.readObject(in);

            solution.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
