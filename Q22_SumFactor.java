
public class Q22_SumFactor {

    public static void main(String[] args) {
        int[] array = {1};
        System.out.println(SumFactor(array));
        System.out.println(SumFactor(new int[]{0}));
        System.out.println(SumFactor(new int[]{3, 0, 2, -5, 0}));
    }

    public static int SumFactor(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int sumFactor = 0;
        int sumOfArray = 0;

        for (int i = 0; i < arr.length; i++) {
            sumOfArray += arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == sumOfArray) {
                sumFactor++;
            }
        }
        return sumFactor;
    }
}
