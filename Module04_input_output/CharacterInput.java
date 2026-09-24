
//package Java-Foundation-Series.Module04_input_output;
import java.util.Scanner;

public class CharacterInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char character = sc.next().charAt(0);
        System.out.println("You entered: " + character);
        sc.close();
    }
}
