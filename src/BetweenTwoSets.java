import java.util.*;

    public class BetweenTwoSets {

        // Function to compute GCD of two numbers
        private static int gcd(int a, int b) {
            return b == 0 ? a : gcd(b, a % b);
        }

        // Function to compute LCM of two numbers
        private static int lcm(int a, int b) {
            return a * (b / gcd(a, b));
        }

        public static int getTotalX(List<Integer> a, List<Integer> b) {
            // Compute LCM of array a
            int lcmA = a.get(0);
            for (int i = 1; i < a.size(); i++) {
                lcmA = lcm(lcmA, a.get(i));
            }

            // Compute GCD of array b
            int gcdB = b.get(0);
            for (int i = 1; i < b.size(); i++) {
                gcdB = gcd(gcdB, b.get(i));
            }

            // Count numbers that are multiples of LCM and divisors of GCD
            int count = 0;
            for (int x = lcmA; x <= gcdB; x += lcmA) {
                if (gcdB % x == 0) {
                    count++;
                }
            }

            return count;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int m = sc.nextInt();

            List<Integer> a = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                a.add(sc.nextInt());
            }

            List<Integer> b = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                b.add(sc.nextInt());
            }

            System.out.println(getTotalX(a, b));
            sc.close();
        }
    }


