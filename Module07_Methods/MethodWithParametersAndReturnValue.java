//package Java-Foundation-Series.Module07_Methods;

public class MethodWithParametersAndReturnValue {
    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int result = add(10, 20);

        System.out.println("Sum = " + result);
    }

}
