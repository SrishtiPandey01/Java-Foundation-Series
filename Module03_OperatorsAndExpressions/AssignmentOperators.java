//package Java-Foundation-Series.Module03_OperatorsAndExpressions;

public class AssignmentOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Assignment
        a = b;
        System.out.println("a = b: " + a);

        // Addition assignment
        a += b;
        System.out.println("a += b: " + a);

        // Subtraction assignment
        a -= b;
        System.out.println("a -= b: " + a);

        // Multiplication assignment
        a *= b;
        System.out.println("a *= b: " + a);

        // Division assignment
        a /= b;
        System.out.println("a /= b: " + a);

        // Modulus assignment
        a %= b;
        System.out.println("a %= b: " + a);
    }
}
