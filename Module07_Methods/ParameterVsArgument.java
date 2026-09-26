//Method definition → Parameter
//Method call       → Argument

public class ParameterVsArgument {
    static int multiply(int a, int b) {
        // a and b are parameters
        return a * b;
    }

    public static void main(String[] args) {
        // 10 and 20 are arguments
        int result = multiply(10, 20);

        System.out.println("Result = " + result);
    }
}
