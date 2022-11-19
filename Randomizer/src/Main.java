import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Kuba", "Hynek", "Olsak", "Marteng", "Standa", "Alex", "Ela", "Lubos", "Bara", "David", "Kuba"};
        List<String> intList = Arrays.asList(names);
        Collections.shuffle(intList);
        intList.toArray(names);
        System.out.println(Arrays.toString(names));
    }
}
