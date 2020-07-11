package zh.codegym.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* 
软件更新
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, String> map = new HashMap<>();
        while (true) {
            String address = reader.readLine();
            if (address.isEmpty()) break;
            String family = reader.readLine();
            if (family.isEmpty())  break;

            map.put(address, family);
        }

        // 读取城市
        String address = reader.readLine();
        System.out.println(map.get(address));

        /**
        // 地址列表
        List<String> addresses = new ArrayList<>();
        while (true) {
            String family = reader.readLine();
            if (family.isEmpty()) break;

            addresses.add(family);
        }

        // 读取门牌号
        int houseNumber = Integer.parseInt(reader.readLine());

        if (0 <= houseNumber && houseNumber < addresses.size()) {
            String familyName = addresses.get(houseNumber);
            System.out.println(familyName);
        }
       */
    }
}
