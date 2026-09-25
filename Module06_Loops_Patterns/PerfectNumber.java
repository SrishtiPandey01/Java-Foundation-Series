//perfect number is a positive integer that is equal to the sum of its proper divisors (excluding itself).
//  For example, 6 is a perfect number because its proper divisors are 1, 2, and 3, and their sum is 6 (1 + 2 + 3 = 6). Another example is 28,
//  which has proper divisors 1, 2, 4, 7, and 14, and their sum is also 28 (1 + 2 + 4 + 7 + 14 = 28).

public class PerfectNumber {
    public static void main(String[] args) {
        int number = 28; // Example number
        int sum = 0; // Initialize sum to 0

        // Calculate the sum of proper divisors
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i; // Add the divisor to the sum
            }
        }

        // Check if the number is perfect
        if (sum == number) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
    }
}
