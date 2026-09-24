//package Java-Foundation-Series.Module04_input_output;

public class NarrowingConversion {
    public static void main(String[] args) {
        double doubleValue = 42.5;
        int intValue = (int) doubleValue; // Narrowing conversion from double to int

        System.out.println("Double value: " + doubleValue);
        System.out.println("Integer value after narrowing conversion: " + intValue);
    }
}
