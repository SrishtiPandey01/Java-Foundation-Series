public class SeparateEvenOdd {
    static void separate(int[] numbers) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            while (left < right && numbers[left] % 2 == 0) {
                left++;
            }

            while (left < right && numbers[right] % 2 != 0) {
                right--;
            }

            if (left < right) {
                int temp = numbers[left];

                numbers[left] = numbers[right];
                numbers[right] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6 };

        separate(numbers);

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
//Note: this separates even and odd values but does not promise to preserve their original relative order.
