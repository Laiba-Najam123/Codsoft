
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        final int minRange = 1;  // Minimum value of the range
        final int maxRange = 100;  // Maximum value of the range
        final int maxAttempts = 5;  // Limit of attempts per round

        int totalScore = 0;

        // Game loop for multiple rounds
        while (true) {
            int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            int attempts = 0;
            int score = 0;

            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("I've picked a number between " + minRange + " and " + maxRange + ". Guess it!");

            // Guessing loop
            while (attempts < maxAttempts) {
                System.out.print("Attempt " + (attempts + 1) + " - Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == randomNumber) {
                    System.out.println("Congratulations! You guessed the correct number.");
                    score = maxAttempts - attempts + 1;  // Calculate score based on remaining attempts
                    break;
                } else if (userGuess < randomNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }

            totalScore += score;
            System.out.println("Round Score: " + score);
            System.out.println("Total Score: " + totalScore);

            // Ask if the player wants to play again
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next();
            if (!playAgain.equalsIgnoreCase("yes")) {
                break;
            }
        }

        System.out.println("Thank you for playing!");
        scanner.close();
    }
}
 
