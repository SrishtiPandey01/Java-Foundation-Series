
public class FirstNonRepeatingCharacter {
    static char findFirst(String text) {
        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);

            int count = 0;

            for (int j = 0; j < text.length(); j++) {
                if (current == text.charAt(j)) {
                    count++;
                }
            }

            if (count == 1) {
                return current;
            }
        }

        return '\0';
    }

    public static void main(String[] args) {
        String text = "swiss";

        char result = findFirst(text);

        if (result != '\0') {
            System.out.println(
                    "First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character");
        }
    }
}
