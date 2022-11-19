import java.time.temporal.ValueRange;

public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){

        ValueRange range = ValueRange.of(0, 23);
        if (!range.isValidIntValue(hourOfDay) || barking == false){
            return false;
        } else if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        } else if (barking == true && hourOfDay < 8 || hourOfDay > 22) {
            return true;
        }else {
            return false;
        }
    }
}
