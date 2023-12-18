package com.linkedin.module1.challenge;

public class Solution {
    public static void main(String[] args) {
        String weatherDescription = "Rainy";  // This is just a sample value.

        switch (weatherDescription) {
            case "Sunny":
                System.out.println("Wear sunscreen and shades!");
                break;
            case "Rainy":
                System.out.println("Carry an umbrella and wear rain boots!");
                break;
            case "Snowy":
                System.out.println("Wear a heavy coat and snow boots!");
                break;
            case "Windy":
                System.out.println("Wear a windbreaker!");
                break;
            default:
                System.out.println("Check the full forecast for more details.");
        }
    }
}
