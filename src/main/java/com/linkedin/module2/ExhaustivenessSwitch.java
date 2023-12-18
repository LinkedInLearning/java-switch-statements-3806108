package com.linkedin.module2;

public class ExhaustivenessSwitch {
    public static void main(String[] args) {
        Color favoriteColor = Color.GREEN;
        String description = switch (favoriteColor) {
            case RED -> "Intense";
            case GREEN -> "Calm";
            case BLUE -> "Cool";
        };

    }
}

enum Color { RED, GREEN, BLUE }
