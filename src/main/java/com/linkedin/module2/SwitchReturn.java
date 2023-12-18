package com.linkedin.module2;

public class SwitchReturn {
    public static void main(String[] args) {
        Month month = Month.JANUARY; // You can set this to any month
        String quarter = getQuarter(month);
        System.out.println("The month " + month + " is in " + quarter);
    }

    public static String getQuarter(Month month) {
        switch (month) {
            case JANUARY, FEBRUARY, MARCH -> { return "Q1"; }
            case APRIL, MAY, JUNE -> { return "Q2"; }
            case JULY, AUGUST, SEPTEMBER -> { return "Q3"; }
            case OCTOBER, NOVEMBER, DECEMBER -> { return "Q4"; }
            default -> { return "Unknown"; }
        }
    }

    public static String getQuarterReturnSwitch(Month month) {
        return switch (month) {
            case JANUARY, FEBRUARY, MARCH -> "Q1";
            case APRIL, MAY, JUNE -> "Q2";
            case JULY, AUGUST, SEPTEMBER -> "Q3";
            case OCTOBER, NOVEMBER, DECEMBER -> "Q4";
            default -> "Unknown";
        };
    }
}

enum Month {
    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
}
