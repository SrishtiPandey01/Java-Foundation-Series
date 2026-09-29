
public class RemoveDuplicateCharacters {
    static String removeDuplicates(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);

            if (result.indexOf(String.valueOf(current)) == -1) {
                result.append(current);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String text = "programming";

        System.out.println(
                removeDuplicates(text));
    }
}
