//package Java-Foundation-Series.Module03_OperatorsAndExpressions;

public class IncrementDecrement {
    public static void main(String[] args) {
        int a = 5;

        // Increment
        System.out.println("Before Increment: " + a);
        System.out.println("Pre-increment: " + ++a);
        System.out.println("After Pre-increment: " + a);
        System.out.println("Post-increment: " + a++);
        System.out.println("After Post-increment: " + a);

        // Decrement
        System.out.println("Before Decrement: " + a);
        System.out.println("Post-decrement: " + a--);
        System.out.println("After Post-decrement: " + a);
        System.out.println("Pre-decrement: " + --a);
        System.out.println("After Pre-decrement: " + a);
    }
}
