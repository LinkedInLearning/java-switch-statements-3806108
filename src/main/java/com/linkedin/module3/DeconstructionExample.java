package com.linkedin.module3;

public class DeconstructionExample {
    public static void main(String[] args) {
        Object obj = new Person("Bobby", 2);
        if (obj instanceof Person(String name, int age)) {
            System.out.println("Name: " + name + ", Age: " + age);
        }

        // Use deconstruction in a switch statement
        Person person = new Person("Maaike", 32);
        switch (person) {
            case Person(String name, int age) ->
                    System.out.println("Name: " + name + ", Age: " + age);
            // other cases
        }




        switch (person) {
            case Person(String name, int age) when age >= 18 ->
                    System.out.println(name + " is an adult.");
            case Person(String name, int age) when age < 18 ->
                    System.out.println(name + " is a minor.");

            // other cases
            default -> throw new IllegalStateException("Unexpected value: " + person);
        }



    }
}
