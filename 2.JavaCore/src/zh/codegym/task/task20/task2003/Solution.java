package zh.codegym.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;

/* 
引入 properties
*/

public class Solution {

    public static Map<String, String> properties = new HashMap<>();

    public void fillInPropertiesMap() throws Exception {
        Scanner in = new Scanner(System.in);
        FileInputStream file = new FileInputStream(in.nextLine());
        load(file);
    }

    public void save(OutputStream outputStream) throws Exception {
        Properties p = new Properties();
        p.putAll(properties);
        p.store(outputStream, "store");
    }

    public void load(InputStream inputStream) throws Exception {
        Properties p = new Properties();
        p.load(inputStream);
        p.stringPropertyNames().forEach(k -> {
            properties.put(k, p.getProperty(k));
        });
    }

    public static void main(String[] args) {

    }
}
