
import java.util.Arrays;

public class ImportantConcepts {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverseArray()));
    }

    public static int[] reverseArray() {
        int[] array = {1, 2, 3, 4, 5, 6};

        int[] result = new int[array.length];

        for (int i = array.length - 1; i >= 0; i--) {
            result[array.length - 1 - i] = array[i];
        }
        return result;
    }


}
