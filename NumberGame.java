import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int targetNumber = random.nextInt(100) + 1;
        int attempts = 0;
        int guess = 0;

        // Testing kosam
        System.out.println("DEBUG: Target Number = " + targetNumber);

        System.out.println("===== Number Guessing Game =====");
        System.out.println("Guess a number between 1 and 100");

        while (guess != targetNumber) {

            System.out.print("Enter your guess: ");

            try {
                guess = sc.nextInt();
                attempts++;

                if (guess < targetNumber) {
                    System.out.println("Too Low!");
                } else if (guess > targetNumber) {
                    System.out.println("Too High!");
                } else {
                    System.out.println("\nCongratulations!");
                    System.out.println("You guessed the correct number: " + targetNumber);
                    System.out.println("Attempts: " + attempts);
                }

            } catch (Exception e) {
                System.out.println("Please enter a valid number.");
                sc.nextLine();
            }
        }

        sc.close();
    }
}