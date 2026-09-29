
public class CheckAnagram {
    static boolean isAnagram(String first, String second) {
        first = first.toLowerCase();
        second = second.toLowerCase();

        if (first.length() != second.length()) {
            return false;
        }

        int[] frequency = new int[256];

        for (int i = 0; i < first.length(); i++) {
            frequency[first.charAt(i)]++;
            frequency[second.charAt(i)]--;
        }

        for (int count : frequency) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String first = "listen";
        String second = "silent";

        System.out.println(isAnagram(first, second));
    }
}
