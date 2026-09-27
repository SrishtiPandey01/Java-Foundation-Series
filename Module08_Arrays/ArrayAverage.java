public class ArrayAverage {
    static double average(int[] numbers) {
        int total = 0;

        for (int number : numbers) {
            total += number;
        }

        return (double) total / numbers.length;
    }

    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30, 40, 50 };

        System.out.println("Average = " + average(numbers));
    }
}
