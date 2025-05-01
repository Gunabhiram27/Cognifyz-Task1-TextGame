package com.cognifyz;

import java.util.Random;
import java.util.Scanner;

public class TextBasedGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;

        System.out.println("🎮 Welcome to the Ultimate Guessing Challenge!");

        while (playAgain) {
            int targetNumber = random.nextInt(100) + 1;
            int guess = 0;
            int attempts = 0;

            System.out.println("\nI have picked a number between 1 and 100. Can you guess it?");

            while (guess != targetNumber) {
                System.out.print("Enter your guess: ");
                if (scanner.hasNextInt()) {
                    guess = scanner.nextInt();
                    attempts++;

                    if (guess < targetNumber) {
                        System.out.println("Too low! Try again.");
                    } else if (guess > targetNumber) {
                        System.out.println("Too high! Try again.");
                    } else {
                        System.out.println("🎉 Correct! You guessed it in " + attempts + " attempts.");
                    }
                } else {
                    System.out.println("❌ Invalid input. Please enter a number.");
                    scanner.next(); // discard invalid input
                }
            }

            System.out.print("\nDo you want to play again? (yes/no): ");
            playAgain = scanner.next().equalsIgnoreCase("yes");
        }

        System.out.println("👋 Thanks for playing! see you again.");
        scanner.close();
    }
}
