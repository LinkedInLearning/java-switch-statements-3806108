package com.linkedin.module2.usecases;

public class TransactionStatusExample {
    public static void main(String[] args) {
        TransactionStatus status = TransactionStatus.PENDING; // Example status

        String message = switch (status) {
            case PENDING -> "Your transaction is being processed.";
            case COMPLETED -> "Your transaction was successful!";
            case FAILED -> "Oops! Your transaction failed. Please try again.";
            case REFUNDED -> "Your transaction has been refunded.";
        };

        System.out.println(message);

    }
}

enum TransactionStatus { PENDING, COMPLETED, FAILED, REFUNDED }
