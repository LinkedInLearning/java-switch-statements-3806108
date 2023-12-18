package com.linkedin.module2.usecases;

public class AccountType {
    public static void main(String[] args) {
        String accountType = "SAVINGS"; // This can change based on the user's account type

        String benefits = switch (accountType) {
            case "SAVINGS" -> "Earn up to 3% interest annually. Access to online banking.";
            case "CHECKING" -> "No minimum balance. Unlimited check writing.";
            case "BUSINESS" -> "Special loans. Higher withdrawal limits. Business credit card.";
            default -> throw new IllegalArgumentException("Unknown account type: " + accountType);
        };

        System.out.println(benefits);

    }
}
