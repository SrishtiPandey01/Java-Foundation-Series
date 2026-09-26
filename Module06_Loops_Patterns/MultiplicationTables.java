public class MultiplicationTables {

    public static void main(String[] args) {
        for (int number = 1; number <= 5; number++) {
            System.out.println("Table of " + number);

            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " x " + i +
                        " = " + (number * i));
            }

            System.out.println();
        }
    }
}
