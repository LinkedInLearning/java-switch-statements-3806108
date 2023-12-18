package com.linkedin.module1;

public class SwitchDayString {
    public static void main(String[] args) {
        String day = "Monday";

        switch (day) {
            case "Monday":
                System.out.println("Start of the work week.");
                break;
            case "Tuesday":
                System.out.println("Second day already!");
                break;
            case "Wednesday":
                System.out.println("Hump day!");
                break;
            case "Thursday":
                System.out.println("Almost Friday!");
                break;
            case "Friday":
                System.out.println("Weekend is near!");
                break;
            case "Saturday":
                System.out.println("Weekend fun!");
                break;
            case "Sunday":
                System.out.println("Rest day before the new week.");
                break;
            default:
                System.out.println("Not a valid day.");
                break;
        }

    }
}
