package zh.codegym.task.task20.task2002;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/* 
读取并写入文件CodeGym
*/

public class Solution {

    public static void main(String[] args) {
        // 你可以在 TMP 目录中找到 your_file_name.tmp，或者按照文件的实际位置调整 outputStream/inputStream
        try {
            File yourFile = File.createTempFile("你的文件名", null);
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            CodeGym codeGym = new CodeGym();
            // 在此初始化 codeGym 对象的 users 字段
            User user = new User();
            user.setFirstName("Wang");
            user.setLastName("Runlin");
            user.setMale(true);
            user.setBirthDate(new Date(System.currentTimeMillis()));
            user.setCountry(User.Country.OTHER);
            codeGym.users.add(user);
            codeGym.save(outputStream);
            outputStream.flush();

            CodeGym loadedObject = new CodeGym();
            loadedObject.load(inputStream);
            // 在此检查 codeGym 对象是否等于 loadedObject 对象

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("糟糕，我的生活出现问题了");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("糟糕，save/load 方法出现问题");
        }
    }

    public static class CodeGym {

        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            PrintWriter pw = new PrintWriter(outputStream);
            users.forEach(user -> {
                pw.println(user.getFirstName());
                pw.println(user.getLastName());
                pw.println(user.getBirthDate().getTime());
                pw.println(user.isMale());
                pw.println(user.getCountry().getDisplayName());
            });
            pw.close();
        }

        public void load(InputStream inputStream) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String firstName;
            String lastName;
            String birthDate;
            String isMale;
            String country;

            while ((firstName = reader.readLine()) != null &&
                    (lastName = reader.readLine()) != null &&
                    (birthDate = reader.readLine()) != null &&
                    (isMale = reader.readLine()) != null &&
                    (country = reader.readLine()) != null) {
                User user = new User();
                user.setFirstName(firstName);
                user.setLastName(lastName);
                user.setBirthDate(new Date(Long.parseLong(birthDate)));
                user.setMale(Boolean.parseBoolean(isMale));
                if (User.Country.UNITED_STATES.getDisplayName().equals(country)) {
                    user.setCountry(User.Country.UNITED_STATES);
                } else if (User.Country.UNITED_KINGDOM.getDisplayName().equals(country)) {
                    user.setCountry(User.Country.UNITED_KINGDOM);
                } else if (User.Country.OTHER.getDisplayName().equals(country)) {
                    user.setCountry(User.Country.OTHER);
                }
                users.add(user);
            }
            reader.close();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CodeGym codeGym = (CodeGym) o;

            return Objects.equals(users, codeGym.users);
        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
