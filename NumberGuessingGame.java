import java.util.Random;

import java.util.Scanner;

 

public class NumberGuessingGame {

    public static void main(String[] args) {

        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1;

        int attempts = 0;

        boolean hasWon = false;

 

        System.out.println("Welcome to the Number Guessing Game!");

        System.out.println("I have chosen a number between 1 and 100.");

        System.out.println("Let's see if you can guess it!");

 

        Scanner scanner = new Scanner(System.in);

 

        while (!hasWon) {

            System.out.print("Enter your guess: ");

            int guess = scanner.nextInt();

            attempts++;

 

            if (guess < secretNumber) {

                System.out.println("Too low!");

            } else if (guess > secretNumber) {

                System.out.println("Too high!");

            } else {

                hasWon = true;

                System.out.println("Congratulations! You've guessed the correct number.");

                System.out.println("Number of attempts: " + attempts);

            }

        }

 

        scanner.close();

    }

}
