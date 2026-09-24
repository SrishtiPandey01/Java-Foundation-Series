
//package Java-Foundation-Series.Module04_input_output;
import java.util.Scanner;

public class MultipleInputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int intValue = sc.nextInt();

        System.out.print("Enter a double value: ");
        double doubleValue = sc.nextDouble();

        sc.nextLine(); // Consume the newline left-over

        System.out.print("Enter a string: ");
        String stringValue = sc.nextLine();

        System.out.println("You entered:");
        System.out.println("Integer: " + intValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("String: " + stringValue);

        sc.close();
    }
}
