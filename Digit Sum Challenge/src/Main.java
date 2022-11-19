public class Main {
    public static void main(String[] args) {
        System.out.println("The sum of digits in number 125 is: " + sumDigit(125));
        System.out.println("The sum of digits in number -125 is: " + sumDigit(-125));
        System.out.println("The sum of digits in number 4 is: " + sumDigit(4));
        System.out.println("The sum of digits in number 32123 is: " + sumDigit(32123));
    }

    private static int sumDigit(int number){
        //code
        if (number < 10){
            return -1;
        }

        int sum = 0;
        while (number > 0){
            //extract the lest-significant digit
            int digit = number % 10;
            sum += digit;

            //drop the least-significant digit
            number /= 10;
        }
        return sum;
    }
}