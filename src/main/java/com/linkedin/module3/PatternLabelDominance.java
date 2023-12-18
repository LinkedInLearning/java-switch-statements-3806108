package com.linkedin.module3;

public class PatternLabelDominance {
    public static void main(String[] args) {
        Object obj = "Guarded Patterns";

        switch (obj) {
//            case String s -> System.out.println("it's a string!");
            case String s when s.startsWith("Guard") -> System.out.println("The string starts with 'Guard'");
            case String s when s.length() > 10 -> System.out.println("The string has more than 10 characters");
            case String s when s.endsWith("Patterns") -> System.out.println("The string ends with 'Patterns'");
            case Integer i when i > 10 -> System.out.println("The integer is greater than 10");
            default -> System.out.println("Unknown object or condition");
        }


    }
}
