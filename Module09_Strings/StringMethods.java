
public class StringMethods {
    public static void main(String[] args) {
        String text = "Java Programming";

        System.out.println("Length: " + text.length());
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());
        System.out.println("Contains Java: " + text.contains("Java"));
        System.out.println("Starts with Java: "
                + text.startsWith("Java"));
        System.out.println("Ends with ing: "
                + text.endsWith("ing"));
        System.out.println("Index of Programming: "
                + text.indexOf("Programming"));
        System.out.println("Substring: "
                + text.substring(5));
    }

}
