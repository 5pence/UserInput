package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        sumUp();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth:");

        boolean hasNextInt = scanner.hasNextInt();

        if (hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); //handle next line character (Enter key)
            int age = 2019 - yearOfBirth;
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();

            if (age >= 0 && age < 130) {
                System.out.println("Your name is " + name + ", and you are " + age + " years old.");
            } else {
                System.out.println("Invalid year of birth");
            }
        } else {
            System.out.println("Unable to parse year of birth");
        }

        scanner.close();
    }

    public static void sumUp() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        for (int i=0; i < 10; i++) {
            System.out.println("Enter a number: ");
            boolean hasNext = scanner.hasNextInt();
            if(hasNext) {
                int num = scanner.nextInt();
                scanner.nextLine();
                sum += num;
            } else {
                System.out.println("Invalid Number");
            }
        }
        System.out.println("Final summed amount is: " + sum);
    }
}
