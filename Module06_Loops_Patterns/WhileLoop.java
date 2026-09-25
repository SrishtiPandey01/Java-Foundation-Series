//package Java-Foundation-Series.Module06_Loops_Patterns;
//while loop is a control flow statement that allows code to be executed repeatedly based on a given boolean condition. The while loop can be thought of as a repeating if statement.
//  The loop will continue to execute as long as the condition evaluates to true. If the condition is false at the beginning, the loop body will not execute at all.
public class WhileLoop {
    public static void main(String[] args) {
        int count = 1;
        while (count <= 5) {
            System.out.println("Count: " + count);
            count++;
        }
    }
}
