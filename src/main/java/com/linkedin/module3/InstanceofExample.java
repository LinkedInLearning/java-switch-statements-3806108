package com.linkedin.module3;

import java.time.LocalDate;

public class InstanceofExample {
    public static void main(String[] args) {
        Object date = LocalDate.now();
        if(date instanceof LocalDate) {
            int year = ((LocalDate) date).getYear();
            System.out.println(year);
        }

        // Cast automatically
        if(date instanceof LocalDate d) {
            int year = d.getYear();
            System.out.println(year);
        }

    }
}
