//package Java-Foundation-Series.Module03_OperatorsAndExpressions;

public class SimpleCalculator {
    public static void main(String[] args) {
        double num1 = 10.5;
        double num2 = 5.2;

        // Addition
        double sum = num1 + num2;
        System.out.println("Sum: " + sum);

        // Subtraction
        double difference = num1 - num2;
        System.out.println("Difference: " + difference);

        // Multiplication
        double product = num1 * num2;
        System.out.println("Product: " + product);

        // Division
        if (num2 != 0) {
            double quotient = num1 / num2;
            System.out.println("Quotient: " + quotient);
        } else {
            System.out.println("Division by zero is not allowed.");
        }
        // Modulus
        double remainder = num1 % num2;
        System.out.println("Remainder: " + remainder);
    }
}
