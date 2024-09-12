public class Q15_EvenHalfSum {
    

    public static void main(String[] args){
        int [] array= {5,4,3,2,3,4,6,1};
        System.out.println(isEvenHalfSum(array));
    }

    public static int isEvenHalfSum(int[] array){
        if(array.length==0){
            return 0;
        }
        if(array.length%2!=0){
            return 0;
        }
        int halfIndex= array.length/2;
        int firstHalfSum=0;
        int secondHalfSum=0;
        for(int i=0;i<halfIndex;i++){
            firstHalfSum+=array[i];
        }
        for(int i=halfIndex;i<array.length;i++){
            secondHalfSum+=array[i];
        }
        if(firstHalfSum==secondHalfSum){
            return 1;
        }
        return 0;
    }
}
