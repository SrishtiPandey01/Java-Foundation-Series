//break statement is used to exit the loop when a certain condition is met. and it is used to terminate the loop and transfer control to the statement immediately following the loop. 
//In this example, when the count reaches 6, the break statement is executed, and the loop is exited, so "Count: 6" and any subsequent counts are not printed.
public class BreakStatement {
    public static void main(String[] args) {
        System.out.println("Using a for loop with a break statement:");
        int iterations = 10; // For simplicity, we'll use a fixed value
        for (int count = 1; count <= iterations; count++) {
            if (count == 6) {
                System.out.println("Breaking the loop at count: " + count);
                break; // Exit the loop when count is 6
            }
            System.out.println("Count: " + count);
        }
    }
}
