//package Java-Foundation-Series.Module04_input_output;

public class WideningConversion {
    public static void main(String[] args) {
        int intValue = 42;
        double doubleValue = intValue; // Widening conversion from int to double

        System.out.println("Integer value: " + intValue);
        System.out.println("Double value after widening conversion: " + doubleValue);
    }
}
