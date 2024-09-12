
public class Q19_IsPorcupine {

    public static void main(String[] args) {
        int n = 131;
        System.out.println(isPorcupine(n));
    }

    public static int isPorcupine(int n) {
        int nextPrime = findNextPrime(n);
        if (isPrime(n) == true && endsWithNine(n) == 1 && endsWithNine(nextPrime) == 1) {
            return 1;
        }
        return 0;
    }

    public static int findNextPrime(int n) {
        int nextNumber = n + 1;
        while (!isPrime(nextNumber)) {
            nextNumber++;
        }
        return nextNumber;
    }

    public static int endsWithNine(int n) {
        if (n % 10 == 9) {
            return 1;
        }
        return 0;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
