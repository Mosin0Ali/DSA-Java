
import java.util.Arrays;

public class CommonElements {

    public static void main(String[] arg) {
        System.out.println("Common Elements in Distinct Arrays");
        int[] testAA = {1, 8, 3, 2};
        int[] testAB = {4, 2, 6, 1};
       
        System.out.println(Arrays.toString(CommonElementsMethod(testAA, testAB)));
        int[] testBA = {1, 8, 3, 2};
        int[] testBB = null;
        System.out.println(Arrays.toString(CommonElementsMethod(testBA, testBB)));

        int[] testCA = {1, 8, 3, 2};
        int[] testCB = {};
        System.out.println(Arrays.toString(CommonElementsMethod(testCA, testCB)));

    }

    public static int[] CommonElementsMethod(int[] arrA, int[] arrB) {
        if (arrA == null || arrB == null) {
            return null;
        }
        int arrMinLen;
        if (arrA.length > arrB.length) {
            arrMinLen = arrB.length;
        } else {
            arrMinLen = arrA.length;
        }
        int[] common = new int[arrMinLen];
        int tempIndex = 0;
        for (int i = 0; i < arrA.length; i++) {
            for (int j = 0; j < arrB.length; j++) {
                if (arrA[i] == arrB[j]) {
                    boolean alreadyAdded = false;
                    for (int k = 0; k < tempIndex; k++) {
                        if (common[k] == arrA[i]) {
                            alreadyAdded = true;
                            break;
                        }
                    }
                    if (!alreadyAdded) {
                        common[tempIndex++] = arrA[i];
                    }
                }
            }
        }
        int[] result = new int[tempIndex];
        for (int l = 0; l < tempIndex; l++) {
            result[l] = common[l];
        }
        return result;
    }
}
