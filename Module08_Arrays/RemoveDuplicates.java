import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] numbers = { 10, 20, 10, 30, 20, 40 };

        int[] unique = new int[numbers.length];
        int size = 0;

        for (int number : numbers) {
            boolean exists = false;

            for (int i = 0; i < size; i++) {
                if (unique[i] == number) {
                    exists = true;
                    break;
                }
            }

            if (!exists) {
                unique[size] = number;
                size++;
            }
        }

        System.out.println(
                Arrays.toString(Arrays.copyOf(unique, size)));
    }
}
