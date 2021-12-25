package zh.codegym.task.task20.task2019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
更正错误。序列化
*/

public class Solution implements Serializable {

    public static void main(String args[]) throws Exception {
        FileOutputStream fileOutput = new FileOutputStream("你的.文件.名");
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutput);

        Solution solution = new Solution();
        outputStream.writeObject(solution);

        fileOutput.close();
        outputStream.close();

        // 加载
        FileInputStream fiStream = new FileInputStream("你的.文件.名");
        ObjectInputStream objectStream = new ObjectInputStream(fiStream);

        Solution loadedObject = (Solution) objectStream.readObject();

        fiStream.close();
        objectStream.close();

        // 注意！！
        System.out.println(loadedObject.size());
    }

    private Map<String, String> m = new HashMap<>();

    public Map<String, String> getMap() {
        return m;
    }

    public Solution() {
        m.put("米奇", "Mouse");
        m.put("米奇", "Mantle");
    }

    public int size() {
        return m.size();
    }
}
