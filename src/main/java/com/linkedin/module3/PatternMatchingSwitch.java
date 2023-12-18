package com.linkedin.module3;

public class PatternMatchingSwitch {
    public static void main(String[] args) {
        Object obj = null;

        switch (obj) {
            case String s -> System.out.println("It's a string: " + s);
            case Integer i -> System.out.println("It's an integer: " + i);
            case Double d -> System.out.println("It's a double: " + d);
            case null, default -> System.out.println("Unknown type");
        }

    }
}
