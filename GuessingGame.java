import java.util.Scanner;
import java.util.Random;

public class GuessingGame{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
        int randomnumber = random.nextInt(100) + 1;
        int maxAttempts = 5;
        
        System.out.println("Welcome to number guessing game");
        System.out.println("Guess the number that I chose from 1 to 100 in " + maxAttempts + " attempts");
        
        for (int attempts = 1; attempts <= maxAttempts; attempts++){
            System.out.println("Enter your guess: ");
            int guess = sc.nextInt();
            sc.nextLine();
            
            if (guess > randomnumber){
                System.out.println("Too high");
            }else if (guess < randomnumber){
                System.out.println("Too low");
            }else if (guess == randomnumber){
                System.out.println("The guessed number is correct");
            return;
            }
        }
            System.out.println("Attempts exceeded. Try again!");
            System.out.println("The RandomNumber is:" + randomnumber);
            
        sc.close();
            
    }
}
