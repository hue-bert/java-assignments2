public class NumberPalindrome {

    public static boolean isPalindrome(int number) {
        //int initialNumber = 0;
        int newNumber = number;
        int reverse = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number = number / 10;
        }
        if (newNumber == reverse){
            return true;
        }
        else {
            return false;
        }
    }
}
