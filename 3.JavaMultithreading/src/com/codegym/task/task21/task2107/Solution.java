package com.codegym.task.task21.task2107;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* 
Deep cloning of a map

*/

public class Solution implements Cloneable {

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.users.put("Hubert", new User(172, "Hubert"));
        solution.users.put("Zapp", new User(41, "Zapp"));
        Solution clone = null;
        clone = (Solution) solution.clone();
        System.out.println(solution);
        System.out.println(clone);

        System.out.println(solution.users);
        System.out.println(clone.users);

    }

    protected Map<String, User> users = new LinkedHashMap();

    @Override
    public Solution clone() {
        try {
            Solution clone = (Solution) super.clone();
            clone.users = new LinkedHashMap<>(this.users);
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public static class User implements Cloneable {
        int age;
        String name;

        public User(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public User clone() {
            try {
                User clone = (User) super.clone();
                // TODO: copy mutable state here, so the clone can't change the internals of the original
                return clone;
            } catch (CloneNotSupportedException e) {
                throw new AssertionError();
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Solution solution = (Solution) o;

        return Objects.equals(users, solution.users);
    }

    @Override
    public int hashCode() {
        return users != null ? users.hashCode() : 0;
    }
}
