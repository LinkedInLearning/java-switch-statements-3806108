package com.linkedin.module2.challenge;

public class Challenge {
    public static void main(String[] args) {
        String accessLevel = "USER";  // Sample value for demonstration

        String message;
        if ("ADMIN".equals(accessLevel)) {
            message = "You have full access.";
        } else if ("USER".equals(accessLevel)) {
            message = "You have limited access.";
        } else if ("GUEST".equals(accessLevel)) {
            message = "You can only view content.";
        } else {
            throw new IllegalArgumentException("Unknown access level: " + accessLevel);
        }

        System.out.println(message);

    }
}
