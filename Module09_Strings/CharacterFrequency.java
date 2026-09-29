
public class CharacterFrequency {
    public static void main(String[] args) {
        String text = "programming";

        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);

            boolean alreadyCounted = false;

            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == current) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (alreadyCounted) {
                continue;
            }

            int count = 0;

            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == current) {
                    count++;
                }
            }

            System.out.println(current + " -> " + count);
        }
    }
}
