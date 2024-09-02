
public class Q3_CharsFromIndexAndLength {

    public static void main(String[] args) {
        System.out.println("Chars from");
        char[] testArray11 = {'a', 'b', 'c'};
        System.out.println(charsFromMethod(testArray11, 0, 3));
    }

    public static char[] charsFromMethod(char[] arr, int start, int len) {

        char[] chars = new char[len];
        if (arr == null || start < 0 || len < 0 || start + len > arr.length) {
            return null;   
        }
        for (int i = 0; i < len; i++) {
            chars[i] = arr[start + i];
        }
        return chars;
    }
}
