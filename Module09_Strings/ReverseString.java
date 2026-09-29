public class ReverseString {
    static String reverse(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = text.length() - 1; i >= 0; i--) {
            result.append(text.charAt(i));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String text = "Java";

        System.out.println("Original: " + text);
        System.out.println("Reversed: " + reverse(text));
    }

}
