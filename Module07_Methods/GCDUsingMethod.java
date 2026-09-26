class GCDUsingMethod {
    static int findGCD(int a, int b) {
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }

        return a;
    }

    public static void main(String[] args) {
        int result = findGCD(48, 18);

        System.out.println("GCD = " + result);
    }
}
