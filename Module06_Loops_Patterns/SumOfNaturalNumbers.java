public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int n = 10; // Calculate the sum of the first 10 natural numbers
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i; // Add the current number to the sum
        }

        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
    }   
}
