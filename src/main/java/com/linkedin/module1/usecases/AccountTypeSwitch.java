package com.linkedin.module1.usecases;

public class AccountTypeSwitch {
    public static void main(String[] args) {
        AccountType userAccount = AccountType.CHECKING;

        switch (userAccount) {
            case SAVINGS:
                System.out.println("Fetching savings account details...");
                break;
            case CHECKING:
                System.out.println("Fetching checking account details...");
                break;
            case BUSINESS:
                System.out.println("Fetching business account details...");
                break;
        }

    }
}
enum AccountType {
    SAVINGS, CHECKING, BUSINESS
}