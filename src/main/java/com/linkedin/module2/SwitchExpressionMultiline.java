package com.linkedin.module2;

public class SwitchExpressionMultiline {
    public static void main(String[] args) {
        String value = "A";
        String result = switch (value) {
            case "A" -> {
                System.out.println("Processing A");
                yield "Type A";
            }
            case "B" -> "Type B";
            default -> throw new IllegalArgumentException("Unknown value: " + value);
        };
    }
}
