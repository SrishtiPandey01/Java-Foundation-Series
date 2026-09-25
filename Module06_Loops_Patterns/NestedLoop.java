public class NestedLoop {
    public static void main(String[] args) {
        int rows = 5; // Number of rows for the pattern

        System.out.println("Using nested loops to print a pattern:");
        for (int i = 1; i <= rows; i++) { // Outer loop for rows
            for (int j = 1; j <= rows; j++) { // Inner loop for columns
                System.out.print("* "); // Print a star
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
