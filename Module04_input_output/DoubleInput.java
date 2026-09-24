//package Java-Foundation-Series.Module04_input_output;

import java.util.Scanner;

public class DoubleInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a double value: ");
        double number = sc.nextDouble();
        System.out.println("You entered: " + number);
        sc.close();
    }
}
