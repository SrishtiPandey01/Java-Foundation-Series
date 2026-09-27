import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Array elements:");

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        scanner.close();
    }
}
