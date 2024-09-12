
public class Q17_IsInertialArray {

    public static void main(String[] args) {
        int[] a = {2, 12, 12, 4, 6, 8, 11};
        System.err.println(isInertial(a));
    }

    public static int isInertial(int[] array) {
        int hasOdd = 0;
        int maxValueEven = 1;
        int oddValGreater = 1;
        int maxVal = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                hasOdd = 1;
            }
            if (array[i] > maxVal) {
                maxVal = array[i];
            }
        }
        if (maxVal % 2 != 0) {
            maxValueEven = 0;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                for (int j = 0; j < array.length; j++) {
                    if (array[j] % 2 == 0 && array[j] != maxVal) {
                        if (array[i] < array[j]) {
                            oddValGreater = 0;
                            break;
                        }
                    }
                }
            }
        }
        if (hasOdd == 1 && maxValueEven == 1 && oddValGreater == 1) {
            return 1;
        }
        return 0;
    }

}
