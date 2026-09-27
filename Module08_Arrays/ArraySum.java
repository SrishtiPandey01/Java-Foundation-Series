public class ArraySum {
    static int sum(int[] numbers) {
        int total = 0;

        for (int number : numbers) {
            total += number;
        }

        return total;
    }

    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30, 40, 50 };

        System.out.println("Sum = " + sum(numbers));
    }
}
