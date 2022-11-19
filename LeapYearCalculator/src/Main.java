import java.time.temporal.ValueRange;

public class Main {
    public static void main(String[] args) {

        System.out.println(isLeapYear(1924));
        System.out.println(getDaysInMonth(2,10000));


    }

    public static boolean isLeapYear(int year){

        ValueRange range = ValueRange.of(1, 9999);
        if (!range.isValidIntValue(year)){
            return false;
        }

        if ((year%4) == 0){
            if ((year%100) == 0){
                if ((year%400) == 0){
                    return true;
                }else {
                    return false;
                }
            }else {
                return true;
            }
        }else {
            return false;
        }
    }


    public static int getDaysInMonth(int month, int year) {

        if ((month < 1 || month > 12) || (year < 1 || year > 9999)){
            return -1;
        }else {
            int daysInMonth = 0;

            switch (month) {
                case 1: case 3: case 5:
                case 7: case 8: case 10:
                case 12:
                    daysInMonth = 31;
                    break;
                case 4: case 6:
                case 9:case 11:
                    daysInMonth = 30;
                    break;
                case 2:
                    if(isLeapYear(year)) {
                        daysInMonth = 29;
                    } else {
                        daysInMonth = 28;
                    }
                    break;
                default: System.out.println("Invalid month");
                    break;
            }

            return daysInMonth;
        }

    }
}
