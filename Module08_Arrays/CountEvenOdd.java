public class CountEvenOdd {
    public static void main(String[] args) {
        int[] numbers = { 10, 15, 20, 25, 30, 35 };

        int even = 0;
        int odd = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even = " + even);
        System.out.println("Odd = " + odd);
    }
}
