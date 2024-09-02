public class Q1_LessCentered {

    public static void main(String[] args) {
        System.out.println("Less Centered Test Results");
        int[] testArray1 = {3, 2, 1, 4, 5};
        int[] testArray2 = {3, 5, 1, 4, 5};
        int[] testArray3 = {3, 5, 5, 4, 5};
        int[] testArray4 = {7};
        System.out.println(LessCenteredMethod(testArray1));
        System.out.println(LessCenteredMethod(testArray2));
        System.out.println(LessCenteredMethod(testArray3));
        System.out.println(LessCenteredMethod(testArray4));
    }

    public static int LessCenteredMethod(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        if (arr.length % 2 == 0) {
            return 0;
        }
        int middleIndex = arr.length / 2;
        int middleValue = arr[middleIndex];

        for (int i = 0; i < arr.length; i++) {
            if (i != middleIndex && arr[i] <= middleValue) {
                return 0;
            }
        }
        return 1;
    }
    
}
