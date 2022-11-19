import java.time.temporal.ValueRange;

public class Main {
    public static void main(String[] args) {

        System.out.println(isCatPlaying(true,10));
        System.out.println(isCatPlaying(false,36));
        System.out.println(isCatPlaying(false,35));
    }

    public static boolean isCatPlaying(boolean summer, int temperature){
        ValueRange rangeOther = ValueRange.of(25, 35);
        ValueRange rangeSummer = ValueRange.of(25, 45);

        if (summer == true && rangeSummer.isValidIntValue(temperature)){
            return true;
        } else if (summer == false && rangeOther.isValidIntValue(temperature)) {
            return true;
        }else {
            return false;
        }
    }
}