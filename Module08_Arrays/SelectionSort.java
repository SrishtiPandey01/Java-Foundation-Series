public class SelectionSort {
    static void sort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            int minimumIndex = i;

            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[minimumIndex]) {
                    minimumIndex = j;
                }
            }

            int temp = numbers[i];

            numbers[i] = numbers[minimumIndex];
            numbers[minimumIndex] = temp;
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
