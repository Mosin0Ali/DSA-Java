
public class Q12_IsBean {

    public static void main(String[] args) {
        int[] arr = {4, 9, 8};
        System.err.println(isBean(arr));
        int[] arr1 = {3, 8, 4};
        System.err.println(isBean(arr1));
        int[] arr2 = {2, 2, 5, 11, 23};
        System.err.println(isBean(arr2));
    }

    public static int isBean(int[] array) {
        int isBean = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if ((array[j] == 2 * array[i]) || (array[j] == 2 * array[i] + 1) || (array[j] == array[i] / 2)) {
                    isBean = 1;
                    break;
                }
            }
            return isBean;
        }
        return isBean;
    }
}
