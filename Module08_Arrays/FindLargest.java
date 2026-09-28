public class FindLargest {
    static int largest(int[] numbers) {
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] numbers = { 25, 10, 45, 30, 15 };

        System.out.println("Largest = " + largest(numbers));
    }
}
