public class LCM {
    public static void main(String[] args) {
        int a = 12;
        int b = 18;

        int max = (a > b) ? a : b;
        int lcm = max;

        while (true) {
            if (lcm % a == 0 && lcm % b == 0) {
                break;
            }

            lcm += max;
        }

        System.out.println("LCM = " + lcm);
    }
}
