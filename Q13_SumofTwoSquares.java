
public class Q13_SumofTwoSquares {

    public static void main(String[] args) {
        int n = 2;
        System.out.println(isSumofTwoSquares(n));
    }

    public static boolean isSumofTwoSquares(int n) {
        boolean firstSquareSum = true;
        boolean secnondSquareSum = false;
        if (n > 0) {
            for (int i = 1; i <= n / 2; i++) {
                if (i * i + i * i == n) {
                    firstSquareSum = true;
                    break;
                } else {
                    firstSquareSum = false;
                }
            }
            if (firstSquareSum == true) {
                for (int j = 1; j <= n / 2; j++) {
                    if (1 + j * j == n) {
                        secnondSquareSum = true;
                        break;
                    }
                }
            }
        }
        return secnondSquareSum;
    }
}
