public class FrequencyOfElements {
    public static void main(String[] args) {
        int[] numbers = { 10, 20, 10, 30, 20, 10 };

        for (int i = 0; i < numbers.length; i++) {
            boolean countedBefore = false;

            for (int j = 0; j < i; j++) {
                if (numbers[i] == numbers[j]) {
                    countedBefore = true;
                    break;
                }
            }

            if (countedBefore) {
                continue;
            }

            int count = 0;

            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                }
            }

            System.out.println(numbers[i] + " -> " + count);
        }
    }
}
