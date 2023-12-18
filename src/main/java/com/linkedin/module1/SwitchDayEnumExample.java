package com.linkedin.module1;

public class SwitchDayEnumExample {
    public static void main(String[] args) {

        Days today = Days.WEDNESDAY;

        switch (today) {
            case MONDAY:
                System.out.println("Oh, it's Monday again!");
                break;
            case TUESDAY:
                System.out.println("Tuesday's here. The week's underway!");
                break;
            case WEDNESDAY:
                System.out.println("Hump day!");
                break;
            case THURSDAY:
                System.out.println("Thursday, one step closer to the weekend!");
                break;
            case FRIDAY:
                System.out.println("Finally Friday!");
                break;
            case SATURDAY:
                System.out.println("Weekend joy!");
                break;
            case SUNDAY:
                System.out.println("Relax, it's Sunday!");
                break;
        }

    }
}

enum Days {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}