public class DifferenceOddEven {

    public static void main(String[] args) {
        System.out.println("Difference Between Odd and Even Test Results");
        int[] testArray5 = {1, 2, 3, 4};
        int[] testArray6 = {3, 3, 4, 4};
        int[] testArray7 = {1, 2, 3};
        int[] testArray8 = {1};
        int[] testArray9 = {};
        int[] testArray10 = {1, 1};
        System.out.println(DifferenceOddEvenMethod(testArray5));
        System.out.println(DifferenceOddEvenMethod(testArray6));
        System.out.println(DifferenceOddEvenMethod(testArray7));
        System.out.println(DifferenceOddEvenMethod(testArray8));
        System.out.println(DifferenceOddEvenMethod(testArray9));
        System.out.println(DifferenceOddEvenMethod(testArray10));
    }

    public static int DifferenceOddEvenMethod(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int X = 0;
        int Y = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                Y = Y + arr[i];
            } else {
                X = X + arr[i];
            }
        }
        return X - Y;
    }
}
