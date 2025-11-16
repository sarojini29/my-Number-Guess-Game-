import java.util.Random;
import java.util.Scanner;

public class NumberGuessinGame{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int numberToGuess = random.nextInt(100) + 1; // 1-100
        int numberOfTries = 0;
        int maxAttempts = 5;
        boolean hasWon = false;
        
        System.out.println("Welcome to Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("You have " + maxAttempts + " attempts to guess it.");
        
        while (numberOfTries < maxAttempts) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            numberOfTries++;
            
            if (userGuess == numberToGuess) {
                hasWon = true;
                break;
            } else if (userGuess < numberToGuess) {
                System.out.println("Too low! Try higher.");
            } else {
                System.out.println("Too high! Try lower.");
            }
            
            System.out.println("Attempts left: " + (maxAttempts - numberOfTries));
        }
        
        if (hasWon) {
            System.out.println("Congratulations! You guessed it in " + numberOfTries + " tries!");
        } else {
            System.out.println("Game Over! The number was: " + numberToGuess);
        }
        
        scanner.close();
    }
}