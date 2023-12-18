package com.linkedin.module3.challenge;

public class Challenge {
    public static void main(String[] args) {
        Object[] objects = {"Java", 123, 45.67, true};

        for (Object obj : objects) {
            if (obj instanceof String) {
                System.out.println("String: " + obj);
            } else if (obj instanceof Integer) {
                System.out.println("Integer: " + obj);
            } else if (obj instanceof Double) {
                System.out.println("Double: " + obj);
            } else if (obj instanceof Boolean) {
                System.out.println("Boolean: " + obj);
            } else {
                System.out.println("Unknown type: " + obj);
            }
        }

    }
}
