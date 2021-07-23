package com.codegym.task.task21.task2104;

import java.util.HashSet;
import java.util.Set;

/* 
Equals and HashCode

*/

public class Solution {
    private final String first, last;

    public Solution(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public boolean equals(Solution n) {
        if (n == null)
            return false;
        if (this == n)
            return true;
        return n.first.equals(first) && n.last.equals(last);
    }

    public int hashCode() {
        return first.hashCode() - last.hashCode();
    }

    public static void main(String[] args) {
        Set<Solution> s = new HashSet<>();
        s.add(new Solution("Donald", "Duck"));
        System.out.println(s.contains(new Solution("Donald", "Duck")));

        Solution solution = new Solution("Donald", "Duck");
        System.out.println(solution.equals(new Solution("Donald", "Duck")));
    }
}

//Requirements:
//        1. The hashcodes of identical objects must be equal.
//        2. The equals method should check whether the passed object is equal to the current object (comparison using ==).
//        3. The equals method should check whether the passed object is a Solution object.
//        4. The equals method must return true if the first and last fields are equal to the passed object and the current one (don't forget that they might be null).
//        5. You must ensure that the HashSet of Solution elements behaves correctly.