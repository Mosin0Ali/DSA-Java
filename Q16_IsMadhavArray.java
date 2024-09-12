
public class Q16_IsMadhavArray {

    public static void main(String[] args) {
        int[] a = {2, 1, 1};
        System.out.println(isMadhavArray(a));
        int[] arr = {3, 1, 2, 3, 0};
        System.out.println(isMadhavArray(arr));
    }

    public static int isMadhavArray(int[] array) {
        int isMadhavLength = 0;
        if (array.length < 3) {
            return 0;
        }
        for (int i = 1; i < array.length; i++) {
            if (array.length == i * (i + 1) / 2) {
                isMadhavLength = 1;
            }
        }
        if (isMadhavLength == 0) {
            return 0;
        }
        int startIndex = 1;
        for (int groupSize = 2; startIndex < array.length; groupSize++) {
            int sum = 0;
            for (int i = 0; i < groupSize; i++) {
                sum += array[startIndex + i];
            }
            if (sum != array[0]) {
                return 0;
            }
            startIndex += groupSize;
        }
        return 1;
    }
}
