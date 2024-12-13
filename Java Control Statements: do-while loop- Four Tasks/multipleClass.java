public class multipleClasses {
    // SumClass
    public static class SumClass {
        public static double calculateSum() {
            double sum = 0.0;
            double i = 1.0;
            do {
                sum += Math.round(i * 10) / 10.0;
                i -= 0.1;
            } while (i >= 0.1);
            return sum;
        }
    }

    // LCM and GCD calculations
    public static class DivisorMultipleClass {
        public static int gcd(int a, int b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }

        public static int lcm(int a, int b) {
            return (a * b) / gcd(a, b);
        }
    }

    public static void main(String[] args) {
        // SumClass
        double sum = SumClass.calculateSum();
        System.out.println("Sum of series 1 + 0.9 + ... + 0.1 = " + sum);
        // DivisorMultipleClass
        int a = 24, b = 36;
        System.out.println("GCD of " + a + " and " + b + " = " + DivisorMultipleClass.gcd(a, b));
        System.out.println("LCM of " + a + " and " + b + " = " + DivisorMultipleClass.lcm(a, b));
    }
}
