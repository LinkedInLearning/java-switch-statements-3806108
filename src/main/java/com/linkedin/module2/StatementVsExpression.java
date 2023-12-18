package com.linkedin.module2;

public class StatementVsExpression {
    public static void main(String[] args) {
        String day = "Monday";

        // Statement
        switch (day) {
            case "Monday":
                System.out.println("Start of the work week.");
                break;
            case "Tuesday":
                System.out.println("It's Tuesday.");
                break;
            case "Wednesday":
                System.out.println("Middle of the week.");
                break;
            case "Thursday":
                System.out.println("Almost Friday!");
                break;
            case "Friday":
                System.out.println("Last day of the work week!");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("It's the weekend!");
                break;
            default:
                System.out.println("Invalid day.");
                break;
        }

        // Expression
        String dayType = switch (day) {
            case "Saturday", "Sunday" ->  "Weekend";
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "Weekday";
            default -> throw new IllegalArgumentException("Invalid day: " + day);
        };

    }
}
