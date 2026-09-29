//package Java-Foundation-Series.Module09_Strings;

public class StringBasics {
    public static void main(String[] args) {
        String text = "Java Programming";

        System.out.println("String: " + text);
        System.out.println("Length: " + text.length());
        System.out.println("First character: " + text.charAt(0));
        System.out.println("Last character: "
                + text.charAt(text.length() - 1));
    }

}

