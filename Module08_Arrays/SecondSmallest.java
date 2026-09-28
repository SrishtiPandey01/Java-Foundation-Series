public class SecondSmallest {
    static int secondSmallest(int[] numbers) {
        int smallest = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int number : numbers) {
            if (number < smallest) {
                second = smallest;
                smallest = number;
            } else if (number < second && number != smallest) {
                second = number;
            }
        }

        return second;
    }

    public static void main(String[] args) {
        int[] numbers = { 40, 10, 30, 20, 50 };

        System.out.println("Second smallest = "
                + secondSmallest(numbers));
    }
}
