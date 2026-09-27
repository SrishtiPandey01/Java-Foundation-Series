public class ReverseNumberUsingRecursion {

    static int reverse(int number, int reverse) {
        if (number == 0) {
            return reverse;
        }

        int digit = number % 10;

        return reverse(number / 10, reverse * 10 + digit);
    }

    public static void main(String[] args) {
        System.out.println("Reverse = " + reverse(12345, 0));
    }
}