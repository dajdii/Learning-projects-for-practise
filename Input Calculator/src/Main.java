import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();

    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        double average = 0;
        int count = 0;

        while(true) {

            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                int number = scanner.nextInt();
                sum += number;
                count++;
                average = (double) sum/ (double) count;
                average = Math.round(average);
            }
            else{
                int avgInInt = (int) average;
                int intSum = (int) sum;
                System.out.println("SUM = " + intSum + " AVG = " + avgInInt);
                break;}
            scanner.nextLine();
        }

        scanner.close();
    }
}