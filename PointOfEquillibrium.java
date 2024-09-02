public class PointOfEquillibrium {
    
    public static void main(String[] args){
        int [] testA={1, 8, 3, 7, 10, 2};
        System.out.println(PointOfEquillibriumMethod(testA));
    }

    public static int PointOfEquillibriumMethod(int[] arr){
            if (arr.length < 3){
                return -1;
            }
            int i=0;
            int j=arr.length-1;
            int idx=1;
            int leftSum=arr[i];
            int rightSum= arr[j];
            for(int k=1;k<arr.length;k++){
                if(leftSum<rightSum){
                    i++;
                    leftSum+=arr[i];
                    idx=i+1;
                }else{
                    j--;
                    rightSum+=arr[j];
                    idx=j-1;
                }
            }
            if(leftSum==rightSum){
                return idx;
            }else{
                return  -1;
            }
    }
}
