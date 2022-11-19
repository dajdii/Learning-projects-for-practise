public class Main {

    public static void main(String[] args) {

        int myValue = 10_000; // 10000 = 10_000

        int myMinValue = Integer.MIN_VALUE;
        int myMaxValue = Integer.MAX_VALUE;
        System.out.println("Integer MIN Value: " + myMinValue);
        System.out.println("Integer MAX Value: " + myMaxValue);

        Byte myMinByteValue = Byte.MIN_VALUE;
        Byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Min Byte:" + myMinByteValue);
        System.out.println("Max Byte:" + myMaxByteValue);

        Short myMinShortValue = Short.MIN_VALUE;
        Short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Min Short: " + myMinShortValue);
        System.out.println("Max Short: " + myMaxShortValue);

        long myLongValue = 100L;
        Long myMinLongValue = Long.MIN_VALUE;
        Long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("myLongValue:" + myLongValue);
        System.out.println("Min Long: " + myMinLongValue);
        System.out.println("Max Long: " + myMaxLongValue);
    }
}
