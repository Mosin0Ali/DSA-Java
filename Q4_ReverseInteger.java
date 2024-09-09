public class Q4_ReverseInteger {

    public static void main(String[] args) {
        System.out.println("Reverse Integer");
        System.out.println(reverseIntegerMethod(-200224));
    }

    public static int reverseIntegerMethod(int num){
        int reversed=0;
        int sign= num<0?-1:1;
        num = Math.abs(num);

        while(num!=0){
            int digit= num%10;
            reversed= reversed*10 +digit;
            num/=10;
        }
        return reversed * sign;
    }
}
