public class InsertionSort {
    static void sort(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            int key = numbers[i];
            int j = i - 1;

            while (j >= 0 && numbers[j] > key) {
                numbers[j + 1] = numbers[j];
                j--;
            }

            numbers[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] numbers = { 50, 20, 40, 10, 30 };

        sort(numbers);

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
