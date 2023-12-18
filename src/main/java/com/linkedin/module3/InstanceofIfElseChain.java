package com.linkedin.module3;

public class InstanceofIfElseChain {
    public static void main(String[] args) {
        Object obj = Double.valueOf(3.234);
        if (obj instanceof String s) {
            System.out.println("It's a string: " + s);
        } else if (obj instanceof Integer i) {
            System.out.println("It's an integer: " + i);
        } else if (obj instanceof Double d) {
            System.out.println("It's a double: " + d);
        } else {
            System.out.println("Unknown type");
        }

    }
}
