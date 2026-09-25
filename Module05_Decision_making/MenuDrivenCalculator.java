//Question: Write a Java program to implement a menu-driven calculator that performs addition, subtraction, multiplication, and division based on user input. The program should continue to display the menu until the user chooses to exit.
import java.util.Scanner;
public class MenuDrivenCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu-Driven Calculator");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit"); 
        System.out.println("Enter your choice (1-5):");     
        int choice = sc.nextInt();
        System.out.println("Enter first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter second number:");
        int num2 = sc.nextInt();

        switch(choice) {
            case 1:
                System.out.println("Addition: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Subtraction: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Multiplication: " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Division   : " + (num1 / num2));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            case 5:
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            default:
                System.out.println("Invalid choice. Please select a valid option.");
        }
        sc.close();
    }
}
