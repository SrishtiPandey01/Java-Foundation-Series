public class CheckSortedArray {
    static boolean isSorted(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < numbers[i - 1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30, 40, 50 };

        System.out.println(isSorted(numbers));
    }
}
