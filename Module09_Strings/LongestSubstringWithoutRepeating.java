import java.util.HashSet;
import java.util.Set;

class LongestSubstringWithoutRepeating {
    static int findLength(String text) {
        Set<Character> set = new HashSet<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < text.length(); right++) {
            char current = text.charAt(right);

            while (set.contains(current)) {
                set.remove(text.charAt(left));
                left++;
            }

            set.add(current);

            int currentLength = right - left + 1;

            maxLength = Math.max(
                    maxLength,
                    currentLength);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String text = "abcabcbb";

        System.out.println(
                "Longest length: "
                        + findLength(text));
    }
}
