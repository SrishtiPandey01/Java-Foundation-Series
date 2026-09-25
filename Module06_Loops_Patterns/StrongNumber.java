//strong number is a number whose sum of the factorial of digits is equal to the number itself. For example, 145 is a strong number because 1! + 4! + 5! = 145. 

public class StrongNumber {
    public static void main(String[] args) {
        int number = 145; // Example number
        int originalNumber = number; // Store the original number for comparison
        int sumOfFactorials = 0; // Initialize sum of factorials to 0

        while (number > 0) {
            int digit = number % 10; // Extract the last digit
            int factorial = 1; // Initialize factorial to 1

            // Calculate factorial of the digit
            for (int i = 1; i <= digit; i++) {
                factorial *= i;
            }

            sumOfFactorials += factorial; // Add the factorial to the sum
            number /= 10; // Remove the last digit from the number
        }

        // Check if the original number is equal to the sum of factorials
        if (originalNumber == sumOfFactorials) {
            System.out.println(originalNumber + " is a Strong Number.");
        } else {
            System.out.println(originalNumber + " is not a Strong Number.");
        }
    }
}
