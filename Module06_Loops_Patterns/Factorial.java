import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt(); // Example number
        int factorial = 1; // Initialize factorial to 1 (multiplicative identity)

        while (number > 0) {
            factorial *= number; // Multiply the current number to the factorial
            number--; // Decrement the number
        }

        System.out.println("The factorial is: " + factorial);
        sc.close();
    }
}
