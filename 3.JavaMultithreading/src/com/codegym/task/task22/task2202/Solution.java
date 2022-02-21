package com.codegym.task.task22.task2202;

/* 
Find a substring

*/

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("CodeGym is the best place to learn Java."));
    }

    public static String getPartOfString(String string) {
        if (string == null || "".equals(string))
            throw new StringTooShortException();

        string = string.substring(string.indexOf(' ') + 1);
        String[] words = string.split(" ");

        if (words.length < 4)
            throw new StringTooShortException();

        return Arrays.stream(words)
                .limit(4)
                .collect(Collectors.joining(" "));
    }

    public static class StringTooShortException extends RuntimeException {
    }
}
