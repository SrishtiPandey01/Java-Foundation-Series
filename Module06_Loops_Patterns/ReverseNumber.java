//question: Write a program to reverse a number using while loop.


import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();  
        int reversedNumber = 0; // Initialize reversed number to 0

        while (number > 0) {
            int digit = number % 10; // Get the last digit
            reversedNumber = reversedNumber * 10 + digit; // Append the digit to the reversed number
            number /= 10; // Remove the last digit from the number
        }

        System.out.println("The reversed number is: " + reversedNumber);
        sc.close();
    }   
}
