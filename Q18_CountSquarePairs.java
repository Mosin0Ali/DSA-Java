
public class Q18_CountSquarePairs {

    public static void main(String[] args) {
        int[] arr = {11, 5, 4, 20};
        System.out.println(isPerfectSquarePair(arr));
    }

    public static int isPerfectSquarePair(int[] array) {

        int perfectSquareCount = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int sum = array[i] + array[j];
                if (isPerfectSquare(sum) == 1) {
                    perfectSquareCount++;
                }
            }
        }
        return perfectSquareCount;
    }

    public static int isPerfectSquare(int n) {
        if (n < 0) {
            return 0;
        }
        for (int i = 0; i * i <= n; i++) {
            if ((i * i) == n) {
                return 1;
            }
        }
        return 0;
    }
}
