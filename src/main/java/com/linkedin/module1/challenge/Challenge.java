package com.linkedin.module1.challenge;

public class Challenge {
    public static void main(String[] args) {
        String weatherDescription = "Rainy";  // this would not be hard coded in real life

        if ("Sunny".equals(weatherDescription)) {
            System.out.println("Wear sunscreen and shades!");
        } else if ("Rainy".equals(weatherDescription)) {
            System.out.println("Carry an umbrella and wear rain boots!");
        } else if ("Snowy".equals(weatherDescription)) {
            System.out.println("Wear a heavy coat and snow boots!");
        } else if ("Windy".equals(weatherDescription)) {
            System.out.println("Wear a windbreaker!");
        } else {
            System.out.println("Check the full forecast for more details.");
        }
    }
}

