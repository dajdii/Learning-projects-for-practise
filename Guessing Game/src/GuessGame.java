import java.util.Scanner;

public class GuessGame {

    public static void main(String[] args) {
        int secretNum;
        int guess;
        boolean correct = false;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("GIVE ME SECRET NUMBER: ");
        secretNum = keyboard.nextInt();

        while (!correct) {

            System.out.print("GUESS: ");
            guess = keyboard.nextInt();

            if (guess == secretNum) {
                correct = true;
                System.out.println("You are RIGHT!");
            } else if (guess < secretNum) {
                System.out.println("HIGHER, try it again!");
            } else if (guess > secretNum) {
                System.out.println("LOWER, try it again!");
            }
        }
    }
}
