
public class LongestWord {
    public static void main(String[] args) {
        String text = "Java programming is interesting";

        String[] words = text.split("\\s+");

        String longest = words[0];

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        System.out.println("Longest word: " + longest);
    }
}
