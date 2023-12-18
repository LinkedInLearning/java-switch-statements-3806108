package com.linkedin.module3;

public class GuardedPatternExample {
    public static void main(String[] args) {
        // if else chain
        Object obj = "Guarded Patterns";

        if (obj instanceof String s && s.startsWith("Guard")) {
            System.out.println("The string starts with 'Guard'");
        } else if (obj instanceof String s && s.length() > 10) {
            System.out.println("The string has more than 10 characters");
        } else if (obj instanceof String s && s.endsWith("Patterns")) {
            System.out.println("The string ends with 'Patterns'");
        } else if (obj instanceof Integer i && i > 10) {
            System.out.println("The integer is greater than 10");
        } else {
            System.out.println("Unknown object or condition");
        }


        // guarded pattern alternative
        switch (obj) {
            case String s when s.startsWith("Guard") -> System.out.println("The string starts with 'Guard'");
            case String s when s.length() > 10 -> System.out.println("The string has more than 10 characters");
            case String s when s.endsWith("Patterns") -> System.out.println("The string ends with 'Patterns'");
            case Integer i when i > 10 -> System.out.println("The integer is greater than 10");
            default -> System.out.println("Unknown object or condition");
        }

    }
}
