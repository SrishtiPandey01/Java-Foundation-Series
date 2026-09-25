//Prime numbers are natural numbers greater than 1 that have no positive divisors other than 1 and themselves. In other words, a prime number is a number that cannot be formed by multiplying two smaller natural numbers. The first few prime numbers are 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, and so on.

public class PrimeNumbersInRange {
    public static void main(String[] args) {
        int start = 10; // Starting number of the range
        int end = 50; // Ending number of the range

        System.out.println("Prime numbers between " + start + " and " + end + " are:");

        for (int num = start; num <= end; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false; // Number is divisible by i, hence not prime
            }
        }
        return true; // Number is prime
    }
}
