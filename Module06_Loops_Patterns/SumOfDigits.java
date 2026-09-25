import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculating the sum of digits of a number:");
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int sum = 0;

        while (number > 0) {
            int digit = number % 10; // Get the last digit
            sum += digit; // Add the digit to the sum
            number /= 10; // Remove the last digit from the number
        }
        System.out.println("The sum of the digits is: " + sum);

        int num = 12345; // Example number
        int sum1 = 0;

        while (num > 0) {
            int digit = num % 10; // Get the last digit
            sum1 += digit; // Add the digit to the sum
            num /= 10; // Remove the last digit from the number
        }

        System.out.println("The sum of the digits is: " + sum1);
        sc.close();
    }
}
