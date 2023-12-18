package com.linkedin.module2;

public class DayTypeExample {
    public static void main(String[] args) {
        String day = "Sunday";
        String dayType;
        switch (day) {
            case "Saturday":
            case "Sunday":
                dayType = "Weekend";
                break;
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                dayType = "Weekday";
                break;
            default:
                throw new IllegalArgumentException("Invalid day: " + day);
        }

        System.out.println("The type of day is " + dayType);

    }
}
