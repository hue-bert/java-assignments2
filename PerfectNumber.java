public class PerfectNumber {

    public static boolean isPerfectNumber(int number) {
        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }

        if (number == 0) {
            return false;
        }

        if (number == sum) {
            return true;
        } else {
            return false;
        }
    }
}
