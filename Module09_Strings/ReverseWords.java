
public class ReverseWords {
    public static void main(String[] args) {
        String text = "Java is powerful";

        String[] words = text.trim().split("\\s+");

        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i]);

            if (i != 0) {
                System.out.print(" ");
            }
        }
    }
}
