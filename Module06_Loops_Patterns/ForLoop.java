//for loop is used to execute a block of code a specific number of times. It consists of three parts: initialization, condition, and increment/decrement.
//  In this example, the loop will print "Count: 1" to "Count: 5" because the loop iterates from 1 to 5.

public class ForLoop {
    public static void main(String[] args) {
        System.out.println("Using a for loop to count from 1 to 5:");
        System.out.println("Enter the number of iterations: ");
        int iterations = 5; // For simplicity, we'll use a fixed value
        for (int count = 1; count <= iterations; count++) {
            System.out.println("Count: " + count);
        }
    }

}
