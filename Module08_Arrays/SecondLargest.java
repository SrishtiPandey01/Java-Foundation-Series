public class SecondLargest {
    static int secondLargest(int[] numbers) {
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number > largest) {
                second = largest;
                largest = number;
            } else if (number > second && number != largest) {
                second = number;
            }
        }

        return second;
    }

    public static void main(String[] args) {
        int[] numbers = { 10, 40, 20, 50, 30 };

        System.out.println("Second largest = "
                + secondLargest(numbers));
    }
}
