//package Java-Foundation-Series.Module04_input_output;

import java.util.Scanner;

class CharacterToASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        int code = ch;

        System.out.println("Character = " + ch);
        System.out.println("Numeric code = " + code);

        sc.close();
    }
}
