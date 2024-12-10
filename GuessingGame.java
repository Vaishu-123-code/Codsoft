import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int maxAttempts = 5;
        int maxRounds = 3;
        int score = 0;

        for (int round = 1; round <= maxRounds; round++) {
            System.out.println("\nRound " + round);

            int numberToGuess = random.nextInt(100) + 1;
            int attempts = 0;

            while (attempts < maxAttempts) {
                System.out.print("Guess a number between 1 and 100: ");
                int guess = scanner.nextInt();
                attempts++;

                if (guess == numberToGuess) {
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                    score++;
                    break;
                } else if (guess < numberToGuess) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }
            }

            if (attempts == maxAttempts) {
                System.out.println("You've reached the maximum number of attempts. The number was " + numberToGuess);
            }
        }

        System.out.println("\nYour final score is: " + score + "/" + maxRounds);
        scanner.close();
    }
}