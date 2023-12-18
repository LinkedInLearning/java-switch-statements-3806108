package com.linkedin.module2.usecases;

public class CurrencyExample {
    public static void main(String[] args) {
        String targetCurrency = "EUR"; // Example currency. It can change based on user's choice.

        double conversionRate = switch (targetCurrency) {
            case "USD" -> 1.00;  // Assuming 1 USD is the base rate
            case "EUR" -> 0.85;  // 1 USD = 0.85 EUR (hypothetical rate)
            case "JPY" -> 110.12; // 1 USD = 110.12 JPY (hypothetical rate)
            case "GBP" -> 0.75;  // 1 USD = 0.75 GBP (hypothetical rate)
            default -> throw new IllegalArgumentException("Unsupported currency: " + targetCurrency);
        };

        System.out.println("The conversion rate " + targetCurrency + " is: " + conversionRate);


    }
}
