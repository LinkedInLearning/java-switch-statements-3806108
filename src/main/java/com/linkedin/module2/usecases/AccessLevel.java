package com.linkedin.module2.usecases;

public class AccessLevel {
    public static void main(String[] args) {
        String accessLevel = "MANAGER";  // Sample value for demonstration

        String message = switch (accessLevel) {
            case "ADMIN" -> "You have full access.";
            case "USER" -> "You have limited access.";
            case "GUEST" -> "You can only view content.";
            case "MANAGER" -> {
                int managedDepartments = 3;  // For demonstration, this can change based on the manager's profile
                yield (managedDepartments > 2) ? "You manage multiple departments." : "You manage a single department.";
            }
            case "AUDITOR" -> {
                boolean internal = true;  // For demonstration, this can change based on the auditor's profile
                yield internal ? "Internal Auditor: Reviewing company's own accounts." : "External Auditor: Reviewing client accounts.";
            }
            default -> throw new IllegalArgumentException("Unknown access level: " + accessLevel);
        };

        System.out.println(message);

    }
}
