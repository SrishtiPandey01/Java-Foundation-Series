public class CountPositiveNegative {
    public static void main(String[] args) {
        int[] numbers = { -5, 10, -20, 30, 40, -15, 0 };

        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int number = 0; number < numbers.length; number++) {
            if (number > 0) {
                positive++;
            } else if (number < 0) {
                negative++;
            } else {
                zero++;
            }
        }

        System.out.println("Positive = " + positive);
        System.out.println("Negative = " + negative);
        System.out.println("Zero = " + zero);
    }
}
