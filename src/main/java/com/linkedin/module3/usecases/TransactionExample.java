package com.linkedin.module3.usecases;

import com.linkedin.module3.usecases.dummyobjects.Deposit;
import com.linkedin.module3.usecases.dummyobjects.LoanPayment;
import com.linkedin.module3.usecases.dummyobjects.Withdrawal;

public class TransactionExample {
    public static void main(String[] args) {
        Object transaction = new LoanPayment(); // get transaction object;

        switch (transaction) {
            case Deposit d when d.getAmount() > 0 -> processDeposit(d);
            case Withdrawal w when w.getAmount() <= getAccountBalance(w.getAccountId()) -> processWithdrawal(w);
            case LoanPayment lp when lp.getAmount() <= getLoanOutstanding(lp.getLoanId()) -> processLoanPayment(lp);
            default -> System.out.println("Invalid or unknown transaction");
        }

    }

    // methods for the sake of the example, no sensible implementation
    private static int getLoanOutstanding(int loanId) {
        return 100;
    }

    private static int getAccountBalance(int accountId) {
        return 100;
    }

    private static void processDeposit(Deposit d) {
        System.out.println("Processing deposit of " + d.getAmount());
    }

    private static void processWithdrawal(Withdrawal w) {
        System.out.println("Processing withdrawal of " + w.getAmount());

    }

    private static void processLoanPayment(LoanPayment lp) {
        System.out.println("Processing loan payment of " + lp.getAmount());

    }
}
