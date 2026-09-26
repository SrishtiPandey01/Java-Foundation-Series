//package Java-Foundation-Series.Module07_Methods;

public class MethodScope {
    static void firstMethod() {
        int number = 10;

        System.out.println("Inside first method: " + number);
    }

    static void secondMethod() {
        int number = 20;

        System.out.println("Inside second method: " + number);
    }

    public static void main(String[] args) {
        firstMethod();
        secondMethod();
    }
}
