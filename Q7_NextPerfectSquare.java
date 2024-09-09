public class Q7_NextPerfectSquare {

    public static void main(String[] args) {
        System.out.println("Next Perfect Square");
        System.out.println(nextPerfectSquareMethod(36));
        System.out.println(nextPerfectSquareMethod(-5));
    }

    public static int nextPerfectSquareMethod(int num) {
        if (num < 0) {
            return 0;
        }
        if (num == 0) {
            return 1;
        }
        int perfectSquare=0;
        for(int i=0;i<num;i++){
             perfectSquare=i*i;
            if(perfectSquare>num){
                break;
            }
        }
        return perfectSquare;
    }
}
