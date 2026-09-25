public class ContinueStatement {
    public static void main(String[] args) {
        System.out.println("Using a for loop with a continue statement:");
        int iterations = 10; // For simplicity, we'll use a fixed value
        for (int count = 1; count <= iterations; count++) {
            if (count == 6) {
                System.out.println("Skipping the iteration at count: " + count);
                continue; // Skip the rest of the loop when count is 6
            }
            System.out.println("Count: " + count);
        }
    }       
}
//continue statement is used to skip the current iteration of a loop and move to the next iteration. In this example, when the count reaches 6, the continue statement is executed, and the loop skips printing "Count: 6" and continues with the next iteration (count 7).