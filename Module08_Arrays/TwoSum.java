public class TwoSum {
    static void twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    System.out.println(
                            "Indexes: " + i + ", " + j);

                    return;
                }
            }
        }

        System.out.println("No pair found");
    }

    public static void main(String[] args) {
        int[] numbers = { 2, 7, 11, 15 };

        twoSum(numbers, 9);
    }
}
