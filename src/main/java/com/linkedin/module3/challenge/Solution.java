package com.linkedin.module3.challenge;

public class Solution {
    public static void main(String[] args) {
        Object[] objects = {"Java", 123, 45.67, true};

        for (Object obj : objects) {
            switch (obj) {
                case String s -> System.out.println("String: " + s);
                case Integer i -> System.out.println("Integer: " + i);
                case Double d -> System.out.println("Double: " + d);
                case Boolean b -> System.out.println("Boolean: " + b);
                case null, default -> System.out.println("Unknown type: " + obj);
            }
        }

    }
}
