
public class StringCompression {
    static String compress(String text) {
        if (text.isEmpty()) {
            return text;
        }

        StringBuilder result = new StringBuilder();

        int count = 1;

        for (int i = 1; i <= text.length(); i++) {
            if (i < text.length()
                    && text.charAt(i) == text.charAt(i - 1)) {
                count++;
            } else {
                result.append(text.charAt(i - 1));
                result.append(count);

                count = 1;
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(
                compress("aaabbcccc"));
    }
}
