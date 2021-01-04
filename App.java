import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        int secretNumber;
            secretNumber = (int) (Math.random() * 9 + 1);
            Scanner keyboard = new Scanner(System.in);
            int guess;
            System.out.println("Hello! In this game, you have to guess the secret number!");
            System.out.println("Ready? Let's begin...");
            do {
                  System.out.print("Guess a number 1-10: ");
                  guess = keyboard.nextInt();
                  if (guess == secretNumber)
                        System.out.println("You guessed it! Congratulations! On to level 2!");
                  else if ((guess < 0)||(guess > 10))
                        System.out.println("I said a number 1-10...");
                  else if (guess < secretNumber)
                        System.out.println("Too low! Try again!");
                  else
                        System.out.println("Too high! Try again!");
            } while (guess != secretNumber);
        int secretNumber2;
            secretNumber2 = (int) (Math.random() * 99 + 1);
            int guess2;
            System.out.println("You made it to level 2! This time, you have to guess from a larger range!");
            System.out.println("Ready? Let's begin...");
            do {
                  System.out.print("Guess a number 1-100: ");
                  guess2 = keyboard.nextInt();
                  if (guess2 == secretNumber2)
                        System.out.println("You guessed it! Congratulations! On to level 3!");
                  else if ((guess2 < 0)||(guess2 > 100))
                        System.out.println("I said a number 1-100...");
                  else if (guess2 < secretNumber2)
                        System.out.println("Too small! Try again!");
                  else
                        System.out.println("Too high! Try again!");
            } while (guess2 != secretNumber2);
        int secretNumber3;
            secretNumber3 = (int) (Math.random() * 999 + 1);
            int guess3;
            System.out.println("You made it to level 3! You have to guess from an even larger range!");
            System.out.println("Ready? Let's begin...");
            do {
                  System.out.print("Guess a number 1-1000: ");
                  guess3 = keyboard.nextInt();
                  if (guess3 == secretNumber3)
                        System.out.println("You guessed it! Congratulations! You have beat the game!");
                  else if ((guess3 < 0)||(guess3 > 1000))
                        System.out.println("I said a number 1-1000...");
                  else if (guess3 < secretNumber3)
                        System.out.println("Too small! Try again!");
                  else
                        System.out.println("Too high! Try again!");
            } while (guess3 != secretNumber3);
    }
}