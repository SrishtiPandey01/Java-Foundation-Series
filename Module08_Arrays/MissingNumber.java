public class MissingNumber {
    static int findMissing(int[] numbers, int n) {
        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;

        for (int number : numbers) {
            actualSum += number;
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 5 };

        System.out.println(
                "Missing = " + findMissing(numbers, 5));
    }
}
