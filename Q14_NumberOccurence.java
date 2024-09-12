public class Q14_NumberOccurence {

    public static void main(String[] args) {
        int[] arr = {6, 8, 1, 8, 2, 2, 2, 2};
        System.out.println("Max repeated element=" + noOfOccurences(arr));

    }

    public static int noOfOccurences(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int occurenceCount = 0;
        int occurenceIndex = -1;
        for (int i = 0; i < array.length; i++) {
            int count = 1;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if (count > occurenceCount) {
                occurenceCount = count;
                occurenceIndex = i;
            }
        }
        return array[occurenceIndex];
    }
}
