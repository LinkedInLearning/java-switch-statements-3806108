package com.linkedin.module2.challenge;

public class Solution {
    public static void main(String[] args) {
        String accessLevel = "USER";  // Sample value

        String message = switch (accessLevel) {
            case "ADMIN" -> "You have full access.";
            case "USER" -> "You have limited access.";
            case "GUEST" -> "You can only view content.";
            default -> throw new IllegalArgumentException("Unknown access level: " + accessLevel);
        };

    }
}
