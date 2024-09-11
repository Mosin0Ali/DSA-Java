public class Q9_PrimeCount {
    public static void main(String[] args) {
        int start = 10;
        int end = 30;
        System.out.println(primeCount(start, end));
    }

    public static int primeCount(int start, int end) {
        int primeCount = 0;
        if (start <= end) {
            for (int i = start; i <= end; i++) {
                if (i > 1) {
                    boolean isPrime = true;
                    for (int j = 2; j * j <= i; j++) {
                        if (i % j == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                    if (isPrime) {
                        primeCount++;
                    }
                }
            }
        }
        return primeCount;
    }
}
