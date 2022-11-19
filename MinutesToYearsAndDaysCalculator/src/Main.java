public class Main {
    public static void main(String[] args) {


        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
        printYearsAndDays(-5);

    }

    public static void printYearsAndDays(long minutes){
        if (minutes < 0){
            System.out.println("Invalid Value");
        }else {
            long minutesToHours = minutes / 60;
            long hoursToDays = minutesToHours / 24;
            long daysToYears = hoursToDays / 365;
            long remaminingDays = hoursToDays % 365;

            System.out.println(minutes + " min = " + daysToYears + " y and " + remaminingDays + " d");
        }

    }

}
