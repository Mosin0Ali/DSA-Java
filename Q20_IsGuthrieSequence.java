
public class Q20_IsGuthrieSequence {

    public static void main(String[] args) {

        int[] array = {8, 4, 2, 1};
        System.out.println(isGuthrieSequence(array));
        int[] array1 = {8, 17, 4, 1};
        System.out.println(isGuthrieSequence(array1));
        int[] array2 = {8, 4, 1};
        System.out.println(isGuthrieSequence(array2));
    }

    public static int isGuthrieSequence(int[] array) {
        if (array[array.length - 1] != 1) {
            return 0;
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] % 2 == 0) {
                if (array[i + 1] != array[i] / 2) {
                    return 0;
                }
            } else {
                if (array[i + 1] != (array[i] * 3 + 1)) {
                    return 0;
                }
            }
        }
        return 1;
    }
}
