public class NestedIf {
    public static void main(String[] args) {
        int age = 20;
        int weight = 50;

        if (age >= 18) {
            if (weight > 50) {
                System.out.println("You are eligible to donate blood.");
            } else {
                System.out.println("You are not eligible to donate blood.");
            }
        } else {
            System.out.println("You must be at least 18 years old to donate blood.");
        }

        int age1 = 20;
        boolean hasId = true;

        if (age1 >= 18) {
            if (hasId) {
                System.out.println("Entry allowed");
            } else {
                System.out.println("ID required");
            }
        } else {
            System.out.println("Age requirement not satisfied");
        }
    }

}
