public class Main {
    public static void main(String[] args) {

        System.out.println(sumOdd(1,100));
        System.out.println(sumOdd(-1,100));
        System.out.println(sumOdd(100,100));
        System.out.println(sumOdd(13,13));
        System.out.println(sumOdd(100,-100));
        System.out.println(sumOdd(100,1000));
        System.out.println(sumOdd(10,5));

    }

    public static boolean isOdd(int number){
        if (number < 0){
            return false;
        } else{
            if (number%2 == 0){
                return false;
            } else {
                return true;
            }
        }
    }

    public static int sumOdd(int start, int end){


        if (start > 0 && end > 0 && end >= start){
            int sum = 0;
            for (int i = start; i <= end; i++){
                if (isOdd(i)){
                    sum += i;
                }
            }

            return sum;
        } else {
            return -1;
        }
    }
}
