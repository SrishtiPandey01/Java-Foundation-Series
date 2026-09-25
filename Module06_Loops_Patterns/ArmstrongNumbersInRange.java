//Armstrong numbers are those numbers whose sum of the cubes of their digits is equal to the number itself. For example, 153 is an Armstrong number because 1^3 + 5^3 + 3^3 = 153. This program finds and prints all Armstrong numbers in the range from 100 to 999.

public class ArmstrongNumbersInRange {
    public static void main(String[] args) {
        int lowerBound = 100; // Lower bound of the range
        int upperBound = 999; // Upper bound of the range

        System.out.println("Armstrong numbers between " + lowerBound + " and " + upperBound + ":");

        for (int number = lowerBound; number <= upperBound; number++) {
            int originalNumber = number; // Store the original number for comparison
            int sum = 0; // Initialize sum to 0
            int temp = number; // Temporary variable to hold the number for processing

            while (temp > 0) {
                int digit = temp % 10; // Extract the last digit
                sum += digit * digit * digit; // Add the cube of the digit to the sum
                temp /= 10; // Remove the last digit from the number
            }

            if (sum == originalNumber) {
                System.out.println(originalNumber); // Print the Armstrong number
            }
        }
    }

}
