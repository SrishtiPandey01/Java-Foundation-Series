public class FindSmallest {

    static int smallest(int[] numbers) {
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        return min;
    }

    public static void main(String[] args) {
        int[] numbers = { 25, 10, 45, 30, 15 };

        System.out.println("Smallest = " + smallest(numbers));
    }
}
