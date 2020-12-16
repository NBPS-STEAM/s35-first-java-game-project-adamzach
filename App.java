public class App {
    public static void main(String[] args) {
        System.out.println("Hello! In this game, you have to guess the secret number! Let's start!");
        int number1 = 7;
        int guess1 = 0;
        while (guess1 != number1) 
            {
              guess1 = readInt("Guess the number between 1-10: ");
            if ((number1 <= -1)&&(number1 >= 11))
            {
              System.out.println("I said a number 1-10...");
            }
            else if (guess1 > number1) 
                {
                System.out.println("Too high! Try again!");
                }
            else if (guess1 < number1)
                {
                  System.out.print("Too low! Try Again!");
                }   
        System.out.println("Correct!");
        }
    }
}
