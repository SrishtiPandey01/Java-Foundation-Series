public class CountDigits {
    public static void main(String[] args) {
        int number = 12345; // Example number
        int count = 0; // Initialize count to 0

        while (number > 0) {
            number /= 10; // Remove the last digit from the number
            count++; // Increment the count
        }

        System.out.println("The number of digits is: " + count);
    }
}
