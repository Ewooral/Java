
public class GuessingGame {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 10);
        System.out.println(num);
        int guess = 0;
        int guessCount = 0;
        int guessLimit = 3;
        boolean outOfGuesses = false;

        while (guess != num && !outOfGuesses) {
            System.out.println("Guess a number between 0 and 9: ");
            guess = Integer.parseInt(System.console().readLine());
            guessCount++;
            if (guessCount > guessLimit) {
                outOfGuesses = true;
            }
        }
        if (outOfGuesses) {
            System.out.println("You are out of guesses. The number was " + num);
        } else {
            System.out.println("You guessed the number!");
        }
    }
}