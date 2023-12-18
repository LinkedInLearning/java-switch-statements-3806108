package com.linkedin.module2;

public class YieldExample {
    public static void main(String[] args) {
        Days day = Days.FRIDAY;
        int nrOfLetters = switch (day) {
            case MONDAY:
            case FRIDAY:
            case SUNDAY:
                System.out.println(6);
                yield 6;
            case TUESDAY:
                System.out.println(7);
                yield 7;
            case THURSDAY:
            case SATURDAY:
                System.out.println(8);
                yield 8;
            case WEDNESDAY:
                System.out.println(9);
                yield 9;
            default:
                throw new IllegalStateException("Invalid day: " + day);
        };
        System.out.println(nrOfLetters);

    }
}

enum Days {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}