//package Java-Foundation-Series.Module03_OperatorsAndExpressions;

public class EvenOdd {
    public static void main(String[] args) {
        int number = 10;

        // Check if the number is even or odd using the modulus operator
        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }
    }
}
