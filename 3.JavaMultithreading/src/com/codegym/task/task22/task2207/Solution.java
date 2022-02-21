package com.codegym.task.task22.task2207;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/* 
Inverted words

*/

public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        String filename = in.nextLine();
        in = new Scanner(new File(filename));

        // 添加单词到列表
        List<String> wordList = new ArrayList<>();
        while (in.hasNextLine()) {
            wordList.addAll(Arrays.asList(in.nextLine().split(" ")));
        }

        String word;
        Set<String> resultSet = new LinkedHashSet<>();
        for (int i = 0; i < wordList.size(); i++) {
            word = wordList.get(i);
            for (int j = i + 1; j < wordList.size(); j++) {
                if (word.equals(new StringBuilder(wordList.get(j)).reverse().toString())) {
                    resultSet.add(word);
                }
            }
        }

        Pair pair = new Pair();
        resultSet.forEach(resultWord -> {
            pair.first = resultWord;
            pair.second = new StringBuilder(resultWord).reverse().toString();
            result.add(pair);
            System.out.println(pair);
        });

//        https://codegym.cc/help/11086
//        while (in.hasNextLine()) {
//            String line = in.nextLine();
//            for (String y : line.split(" ")) {
//                StringBuilder x = new StringBuilder(y);
//                if (values.contains(x.reverse().toString())) {
//                    //System.out.println("what");///////
//                    values.remove(x.toString());
//                    Pair p = new Pair();
//                    p.first = y;
//                    p.second = x.toString();
//                    result.add(p);
//                } else values.add(y);
//            }
//        }
    }

    public static class Pair {
        String first;
        String second;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;
        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return first == null && second == null ? "" :
                    first == null ? second :
                            second == null ? first :
                                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;
        }
    }

}
