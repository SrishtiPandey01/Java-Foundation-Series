public class BubbleSort {
    static void sort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];

                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
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
//Complexity, Worst case: O(n²)
