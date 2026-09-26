class PalindromeUsingMethod {
    static boolean isPalindrome(int number) {
        int original = number;
        int reverse = 0;

        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }

        return original == reverse;
    }

    public static void main(String[] args) {
        int number = 121;

        if (isPalindrome(number)) {
            System.out.println("Palindrome number");
        } else {
            System.out.println("Not a palindrome number");
        }
    }
}