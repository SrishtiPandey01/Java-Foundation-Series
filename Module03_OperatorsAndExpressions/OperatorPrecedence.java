//package Java-Foundation-Series.Module03_OperatorsAndExpressions;

public class OperatorPrecedence {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 2;

        // Example of operator precedence
        int result = a + b * c; // Multiplication has higher precedence than addition
        System.out.println("Result of a + b * c: " + result); // Output: 20

        // Using parentheses to change the order of evaluation
        result = (a + b) * c; // Parentheses have the highest precedence
        System.out.println("Result of (a + b) * c: " + result); // Output: 30

        // Example of operator associativity
        int x = 10;
        int y = 5;
        int z = 2;

        // Left-to-right associativity for addition and subtraction
        int leftToRight = x - y + z; // Evaluated as (x - y) + z
        System.out.println("Result of x - y + z: " + leftToRight); // Output: 7

        // Right-to-left associativity for assignment operators
        int m, n, o;
        m = n = o = 10; // Evaluated as m = (n = (o = 10))
        System.out.println("Values of m, n, o: " + m + ", " + n + ", " + o); // Output: 10, 10, 10
    }   
}
