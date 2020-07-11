package zh.codegym.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
字母数
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // 字母
        String abc = "abcdefghijklmnopqrstuvwxyz";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<>();
        for (char letter : abcArray) {
            alphabet.add(letter);
        }

        // 读取字符串
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        int[] countArray = new int[abcArray.length];

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < alphabet.size(); j++) {
                for (int k = 0; k < list.get(i).length(); k++) {
                    if (alphabet.get(j) == (list.get(i).charAt(k)))
                        countArray[j]++;
                }
            }
        }

        for (int i = 0; i < abcArray.length; i++) {
            System.out.println(abcArray[i] + " " + countArray[i]);
        }
    }
}
