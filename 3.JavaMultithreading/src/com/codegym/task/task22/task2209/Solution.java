package com.codegym.task.task22.task2209;

/* 
Make a word chain

*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String filename = in.nextLine();
        BufferedReader reader = new BufferedReader(new FileReader(filename));

        String line;
        List<String> wordList = new ArrayList<>();
        while ((line = reader.readLine()) != null) {
            wordList.addAll(Arrays.asList(line.split(" ")));
        }

        StringBuilder result = getLine(wordList.toArray(new String[0]));
        System.out.println(result.toString());
    }

    public static StringBuilder getLine(String... words) {
        StringBuilder sb = new StringBuilder();
        if (words == null || words.length == 0) return sb;

        String[] wordsCopy = Arrays.copyOf(words, words.length);
        Arrays.sort(wordsCopy);

        for (int i = wordsCopy.length - 1; i >= 0; i--) {
            sb.append(wordsCopy[i]).append(" ");
        }

        // delete last space
        if (sb.length() > 0)
            sb = new StringBuilder(sb.substring(0, sb.length() - 1));

        return sb;
    }
}
