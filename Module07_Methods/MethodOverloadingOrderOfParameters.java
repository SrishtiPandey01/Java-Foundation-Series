class MethodOverloadingOrderOfParameters {
    static void display(int number, String text) {
        System.out.println("Integer first");
    }

    static void display(String text, int number) {
        System.out.println("String first");
    }

    public static void main(String[] args) {
        display(10, "Java");
        display("Java", 10);
    }
}