package com.codegym.task.task22.task2203;

/* 
Between tabs

*/

public class Solution {
    public static String getPartOfString(String string) throws StringTooShortException {
        if (string == null || "".equals(string))
            throw new StringTooShortException();

        int beginIndex = string.indexOf('\t') + 1;
        int endIndex = string.indexOf('\t', beginIndex);

        if (beginIndex >= endIndex)
            throw new StringTooShortException();

        return string.substring(beginIndex, endIndex);
    }

    public static class StringTooShortException extends Exception {
    }

    public static void main(String[] args) throws StringTooShortException {
        System.out.println(getPartOfString("\tCodeGym is the best place \tto learn Java\t."));
    }
}
