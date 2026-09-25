//palindrome number is a number that remains the same when its digits are reversed. For example, 121, 12321, and 1234321 are palindromic numbers. In this program, we will check if a given number is a palindrome or not.
import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt()   ; // Example number
        int originalNumber = number; // Store the original number for comparison
        int reversedNumber = 0; // Initialize the reversed number to 0

        while (number > 0) {
            int digit = number % 10; // Extract the last digit
            reversedNumber = (reversedNumber * 10) + digit; // Build the reversed number
            number /= 10; // Remove the last digit from the number
        }

        // Check if the original number is equal to the reversed number
        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a palindrome.");
        } else {
            System.out.println(originalNumber + " is not a palindrome.");
        }
        sc.close();
    }   
}
