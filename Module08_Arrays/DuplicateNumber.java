public class DuplicateNumber {
    public static void main(String[] args) {
        int[] numbers = { 1, 3, 4, 2, 2 };

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    System.out.println(
                            "Duplicate = " + numbers[i]);

                    return;
                }
            }
        }
    }
}
