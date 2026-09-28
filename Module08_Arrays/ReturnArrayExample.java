public class ReturnArrayExample {
    static int[] createArray() {
        return new int[] { 10, 20, 30 };
    }

    public static void main(String[] args) {
        int[] numbers = createArray();

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
