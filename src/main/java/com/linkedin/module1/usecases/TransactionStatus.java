package com.linkedin.module1.usecases;

public class TransactionStatus {
    public static void main(String[] args) {

        String transactionStatus = "Completed";

        switch (transactionStatus) {
            case "Pending":
                System.out.println("Your transaction is being processed.");
                break;
            case "Completed":
                System.out.println("Your transaction was successful!");
                break;
            case "Failed":
                System.out.println("Oops! Your transaction failed. Please try again.");
                break;
            default:
                System.out.println("Unknown transaction status.");
        }


    }
}
