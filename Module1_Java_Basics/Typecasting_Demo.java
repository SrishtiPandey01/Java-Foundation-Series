public class Typecasting_Demo {
    public static void main(String[] args) {
        // Implicit Typecasting (Widening)
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println("Implicit Typecasting:");
        System.out.println("Integer value: " + myInt);
        System.out.println("Double value: " + myDouble);

        // Explicit Typecasting (Narrowing)
        double myDouble2 = 9.78;
        int myInt2 = (int) myDouble2; // Manual casting: double to int

        System.out.println("\nExplicit Typecasting:");
        System.out.println("Double value: " + myDouble2);
        System.out.println("Integer value: " + myInt2);
    }
}
