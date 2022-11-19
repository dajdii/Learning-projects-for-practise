import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String userInput = scanner.next();
        System.out.println("Hi, " + userInput + "!");

        System.out.println("Enter your year of birth: ");
        int yearOfBirth = scanner.nextInt();
        System.out.println("You were born in " + yearOfBirth);

        scanner.close();
    }
}