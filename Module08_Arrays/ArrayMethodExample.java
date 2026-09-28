class ArrayMethodExample {
    static void display(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30 };

        display(numbers);
    }
}