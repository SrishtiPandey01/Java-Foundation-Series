
//package Java-Foundation-Series.Module04_input_output;
import java.util.Scanner;

class NextVsNextLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = sc.next();

        sc.nextLine();

        System.out.print("Enter your full address: ");
        String address = sc.nextLine();

        System.out.println("First Name = " + firstName);
        System.out.println("Address = " + address);

        sc.close();
    }
}