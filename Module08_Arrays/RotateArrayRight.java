public class RotateArrayRight {
    static void rotateRight(int[] numbers) {
        if (numbers.length == 0) {
            return;
        }

        int last = numbers[numbers.length - 1];

        for (int i = numbers.length - 1; i > 0; i--) {
            numbers[i] = numbers[i - 1];
        }

        numbers[0] = last;
    }

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };

        rotateRight(numbers);

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
