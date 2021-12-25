package zh.codegym.task.task20.task2005;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* 
奇怪的事情
*/

public class Solution {

    public static void main(String[] args) {
        // 基于硬盘上文件的路径，更新传递给 createTempFile 方法的字符串。
        try {
            File yourFile = File.createTempFile("你的文件名", null);
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            Human smith = new Human ("史密斯", new Asset ("住宅"), new Asset ("汽车"));
            smith.save(outputStream);
            outputStream.flush();

            Human somePerson = new Human();
            somePerson.load(inputStream);
            // 检查史密斯是否等于 somePerson
            System.out.println(smith.equals(somePerson));
            inputStream.close();

        } catch (IOException e) {
            // e.printStackTrace();
            System.out.println("糟糕，我的生活出现问题了");
        } catch (Exception e) {
            // e.printStackTrace();
            System.out.println("糟糕，save/load 方法出现问题");
        }
    }

    public static class Human {

        public String name;
        public List<Asset> assets = new ArrayList<>();

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Human human = (Human) o;

            if (!Objects.equals(name, human.name)) return false;
            return Objects.equals(assets, human.assets);
        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() :0;
            result = 31 * result + (assets != null ? assets.hashCode() : 0);
//            return (int) (Math.random() * 100);
            return result;
        }

        public Human() {
        }

        public Human(String name, Asset... assets) {
            this.name = name;
            if (assets != null) {
                this.assets.addAll(Arrays.asList(assets));
            }
        }

        public void save(OutputStream outputStream) throws Exception {
            PrintWriter printWriter = new PrintWriter(outputStream);
            printWriter.println(this.name);
            assets.forEach(current -> {
                printWriter.println(current.getName());
                printWriter.println(current.getPrice());
            });
            printWriter.close();
        }

        public void load(InputStream inputStream) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            this.name = reader.readLine();
            String assetName, assetPrice;
            while ((assetName = reader.readLine()) != null && (assetPrice = reader.readLine()) != null) {
                Asset asset = new Asset(assetName);
                asset.setPrice(Double.parseDouble(assetPrice));
                this.assets.add(new Asset(assetName));
            }
            reader.close();
        }
    }
}
