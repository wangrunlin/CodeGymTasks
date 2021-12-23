package com.codegym.task.task21.task2105;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* 
Fix the bug. Comparing objects

*/

public class Solution {
    private final String first, last;

    public Solution(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public boolean equals(Object o) {
        if (o == this)
            return true;

        if (o == null)
            return false;

        if (!(o instanceof Solution))
            return false;
        Solution n = (Solution) o;
        return Objects.equals(first, n.first) && Objects.equals(last, n.last);
    }

    @Override
    public int hashCode() {
        int hash1 = 0, hash2 = 0;
        if (first != null) hash1 = first.hashCode();
        if (last != null) hash2 = last.hashCode();
        return 31 * (hash1 + hash2);
    }

    public static void main(String[] args) {
        Set<Solution> s = new HashSet<>();
        s.add(new Solution("Mickey", "Mouse"));
        System.out.println(s.contains(new Solution("Mickey", "Mouse")));
    }
}
