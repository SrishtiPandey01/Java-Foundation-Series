//question: Write a program to find the product of digits of a number using while loop.

public class ProductOfDigits {
    public static void main(String[] args) {
        int number = 1234; // Example number
        int product = 1; // Initialize product to 1 (multiplicative identity)

        while (number > 0) {
            int digit = number % 10; // Extract the last digit
            product *= digit; // Multiply the digit to the product
            number /= 10; // Remove the last digit from the number
        }

        System.out.println("The product of the digits is: " + product);
    }

}
