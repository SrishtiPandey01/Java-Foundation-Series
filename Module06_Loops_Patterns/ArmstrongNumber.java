//Armstrong numbers are those numbers whose sum of the cubes of their digits is equal to the number itself. For example, 153 is an Armstrong number because 1^3 + 5^3 + 3^3 = 153. This program checks if a given number is an Armstrong number or not.

public class ArmstrongNumber {
    public static void main(String[] args) {
        int number = 153; // Example number
        int originalNumber = number; // Store the original number for comparison
        int sum = 0; // Initialize sum to 0

        while (number > 0) {
            int digit = number % 10; // Extract the last digit
            sum += digit * digit * digit; // Add the cube of the digit to the sum
            number /= 10; // Remove the last digit from the number
        }

        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }
}
