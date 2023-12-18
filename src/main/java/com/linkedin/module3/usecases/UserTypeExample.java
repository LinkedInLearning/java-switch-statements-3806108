package com.linkedin.module3.usecases;

import com.linkedin.module3.usecases.dummyobjects.AccountHolder;
import com.linkedin.module3.usecases.dummyobjects.Admin;
import com.linkedin.module3.usecases.dummyobjects.Auditor;
import com.linkedin.module3.usecases.dummyobjects.Guest;

public class UserTypeExample {
    public static void main(String[] args) {
        Object user = new Guest(); // get user object, could be different data types or classes;

        switch (user) {
            case Admin a when a.isActive() -> System.out.println("Admin Access granted to " + a.getName());
            case AccountHolder acc when acc.hasAccount() -> System.out.println("Welcome, " + acc.getName());
            case Auditor aud when aud.isInternal() -> System.out.println("Auditor Access: Restricted mode");
            case Guest g -> System.out.println("Guest Access: View only mode");
            default -> System.out.println("Unknown user type or access denied");
        }
    }
}
