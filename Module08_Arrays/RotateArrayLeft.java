public class RotateArrayLeft {
    static void rotateLeft(int[] numbers) {
        if (numbers.length == 0) {
            return;
        }

        int first = numbers[0];

        for (int i = 0; i < numbers.length - 1; i++) {
            numbers[i] = numbers[i + 1];
        }

        numbers[numbers.length - 1] = first;
    }

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };

        rotateLeft(numbers);

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
