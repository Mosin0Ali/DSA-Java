
class Q23_EvenSpaced {

    public static void main(String[] args) {
        System.out.println(EvenSpaced(new int[]{100, 19, 131, 140}));
        System.out.println(EvenSpaced(new int[]{200, 10, 151, 160}));
    }

    public static int EvenSpaced(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int largestNumber = array[0];
        int smallestNumber = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > largestNumber) {
                largestNumber = array[i];
            }
            if (array[i] < smallestNumber) {
                smallestNumber = array[i];
            }
        }
        if ((largestNumber - smallestNumber) % 2 == 0) {
            return 1;
        }
        return 0;
    }
}
