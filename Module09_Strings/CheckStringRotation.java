
public class CheckStringRotation {
    static boolean isRotation(
            String first,
            String second) {
        if (first.length() != second.length()) {
            return false;
        }

        return (first + first).contains(second);
    }

    public static void main(String[] args) {
        String first = "ABCD";
        String second = "CDAB";

        System.out.println(
                isRotation(first, second));
    }
}
