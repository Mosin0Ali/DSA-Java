public class Q8_UpCount {

    public static void main(String[] args){
        int[] arr={2,3,1,-6,8,-3,-1,2};
        int n =5;
        System.out.println(upCount(arr, n));
    } 

    public static int upCount(int[] arr, int n){
        int upcount=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            int partialSum=sum;
            sum+=arr[i];
            if(partialSum<=n && sum>n){
                upcount=upcount+1;
            }
        }
        return upcount;
    }
}
