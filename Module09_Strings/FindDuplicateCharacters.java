
public class FindDuplicateCharacters {
    public static void main(String[] args) {
        String text = "programming";

        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);

            boolean alreadyChecked = false;

            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == current) {
                    alreadyChecked = true;
                    break;
                }
            }

            if (alreadyChecked) {
                continue;
            }

            int count = 0;

            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == current) {
                    count++;
                }
            }

            if (count > 1) {
                System.out.println(current);
            }
        }
    }

}
