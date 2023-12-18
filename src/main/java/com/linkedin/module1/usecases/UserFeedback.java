package com.linkedin.module1.usecases;

public class UserFeedback {
    public static void main(String[] args) {
        int userFeedback = 4;

        switch (userFeedback) {
            case 5:
                System.out.println("Thank you! We're glad you had a great experience.");
                break;
            case 4:
                System.out.println("Thank you! We appreciate your positive feedback.");
                break;
            case 3:
                System.out.println("Thanks for your feedback. We'll strive to improve.");
                break;
            case 2:
            case 1:
                System.out.println("We're sorry to hear that. Please let us know how we can better assist you.");
                break;
        }

    }
}
