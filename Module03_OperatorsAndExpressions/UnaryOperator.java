//package Java-Foundation-Series.Module03_OperatorsAndExpressions;

public class UnaryOperator {
    public static void main(String[] args) {
        int a = 10;

        // Unary plus
        int positive = +a;
        System.out.println("Unary plus: " + positive);

        // Unary minus
        int negative = -a;
        System.out.println("Unary minus: " + negative);

        // Increment
        int incremented = ++a;
        System.out.println("Incremented: " + incremented);

        // Decrement
        int decremented = --a;
        System.out.println("Decremented: " + decremented);

        boolean isTrue = true;
        // Logical NOT
        boolean isFalse = !isTrue;
        System.out.println("Logical NOT: " + isFalse);
    }
}
