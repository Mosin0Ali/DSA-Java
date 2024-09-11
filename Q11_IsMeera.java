public class Q11_IsMeera {
    public static void main(String[] args) {
        int[] arr = { 7, 7, 0, 10, 1 };
        System.out.println(isMeera(arr));
        int[] arr2 = { 1, 7, 0, 10, 9 };
        System.out.println(isMeera(arr2));
        int[] arr3 = { 6, 10, 8 };
        System.out.println(isMeera(arr3));
    }

    public static int isMeera(int[] arr) {
        int isMeera = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1 || arr[i] == 9) {
                if (arr[i] == 1) {
                    for (int j = i; j < arr.length; j++) {
                        if (arr[j] == 9) {
                            isMeera = 1;
                            return isMeera;
                        }
                    }
                }
                if (arr[i] == 9) {
                    for (int j = i; j < arr.length; j++) {
                        if (arr[j] == 1) {
                            isMeera = 1;
                            return isMeera;
                        }
                    }
                }
            }
            isMeera = 0;
        }
        return isMeera;
    }
}
