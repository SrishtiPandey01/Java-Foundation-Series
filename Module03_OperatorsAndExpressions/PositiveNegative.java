//package Java-Foundation-Series.Module03_OperatorsAndExpressions;

public class PositiveNegative {
    public static void main(String[] args) {
        int number = -10;

        // Check if the number is positive or negative
        if (number > 0) {
            System.out.println(number + " is a positive number.");
        } else if (number < 0) {
            System.out.println(number + " is a negative number.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}
