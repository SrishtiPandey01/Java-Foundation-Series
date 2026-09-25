//do while loop is similar to while loop but the difference is that in do while loop the condition is checked after the execution of the loop body. This means that the loop body will always execute at least once, regardless of whether the condition is true or false. 
// In this example, the loop will print "Count: 1" to "Count: 5" because the condition is checked after each iteration.

public class DoWhileLoop {
    public static void main(String[] args) {
        int count = 1;
        do {
            System.out.println("Count: " + count);
            count++;
        } while (count <= 5);
    }
}
