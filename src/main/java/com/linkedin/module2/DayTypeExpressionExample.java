package com.linkedin.module2;

public class DayTypeExpressionExample {
    public static void main(String[] args) {
        String day = "Sunday";
        String dayType = switch (day) {
            case "Saturday", "Sunday" ->  "Weekend";
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "Weekday";
            default -> throw new IllegalArgumentException("Invalid day: " + day);
        };

        System.out.println(dayType);
    }
}
