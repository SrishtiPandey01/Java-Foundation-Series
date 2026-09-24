//package Java-Foundation-Series.Module04_input_output;
import java.util.Scanner;
public class StudentDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter student age: ");
        int age = sc.nextInt();
        System.out.print("Enter student grade: ");
        double grade = sc.nextDouble();

        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
