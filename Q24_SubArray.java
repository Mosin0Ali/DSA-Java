public class Q24_SubArray {
    public static void main(String[] args){
        int [] arr={13,6,3,2};
        System.out.println(SubArray(arr));
        System.out.println(SubArray(new int [] {11,5,3,2}));
    }
    
    public static int SubArray(int[] array){
        int arrlen=array.length;
        if(arrlen==0){
            return 0;
        }
        for(int i=0;i<arrlen;i++){
            int sumafterthat=0;
            for(int j=i+1;j<arrlen;j++){
                sumafterthat+=array[j];
            }
            if(array[i]<=sumafterthat){
                return  0;
            }
        }
        return 1;
    }
}
