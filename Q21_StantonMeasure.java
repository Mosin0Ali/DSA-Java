
public class Q21_StantonMeasure {

    public static void main(String[] args) {
        int[] array = {1};
        System.out.println(StantonMeasure(array));
        System.out.println(StantonMeasure(new int[] {0}));
        System.out.println(StantonMeasure(new int[] {1,3,1,1,3,3,2,3,3,3,4}));
    }

    public static int StantonMeasure(int[] array) {
        if (array.length == 0) {
            return 0;
        }

        int occurenceOfOne = 0;
        int stantonMeasure = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                occurenceOfOne++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == occurenceOfOne) {
                stantonMeasure++;
            }
        }
        return stantonMeasure;
    }
}
