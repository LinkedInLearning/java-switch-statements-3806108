package com.linkedin.module1;

public class SwitchInsteadOfNestedIf {
    public static void main(String[] args) {
        int value = 2;

        switch (value) {
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
            case 3:
                System.out.println("Value is 3");
                break;
            case 4:
                System.out.println("Value is 4");
                break;
            case 5:
                System.out.println("Value is 5");
                break;
            default:
                System.out.println("Value is not between 1 and 5");
        }

    }
}
