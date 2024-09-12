
import java.util.Arrays;

public class Q25_IsSym {

    public static void main(String[] args) {

        System.out.println(IsSym(new int[]{2, 7, 9, 10, 11, 5, 8}));
        System.out.println(IsSym(new int[]{2, 7, 8, 9, 11, 13, 10}));
    }

    public static int IsSym(int[] a) {
        if (a.length == 0) {
            return 0;
        }

        String[] leftToRight = new String[a.length];
        String[] rightToLeft = new String[a.length];

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                leftToRight[i] = "even";
            } else {
                leftToRight[i] = "odd";
            }
        }

        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] % 2 == 0) {
                rightToLeft[a.length - 1 - i] = "even";
            } else {
                rightToLeft[a.length - 1 - i] = "odd";
            }
        }
        
        System.out.println(Arrays.toString(leftToRight));
        System.out.println(Arrays.toString(rightToLeft));

        for (int i = 0; i < a.length; i++) {
            if (leftToRight[i] != rightToLeft[i]) {
                return 0;
            }
        }
        return 1;
    }
}
