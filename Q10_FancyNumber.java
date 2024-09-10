
public class Q10_FancyNumber {

    public static void main(String[] args) {
        //These numbers are fancy numbers 3*17 + 2*5 =61 :- {1,1,5,17,61,217,....}
        System.out.println("Is Fancy Number?");
        System.out.println(IsFancyNumberMethod(6));
        System.out.println(IsFancyNumberMethod(17));
        System.out.println(IsFancyNumberMethod(61));
        System.out.println(IsFancyNumberMethod(217));                                                                                                                                  
    }

    public static int IsFancyNumberMethod(int num) {
    
        if(num==1){
            return 1;
        }
        if(num<=0){
            return  0;
        }
        int isFancy=0;
        int previous=1;
        int pprevious=1;
        int current=0;
        for(int i=0;i<num/2;i++){
            current= 3*previous+2*pprevious;
            if(current==num){
                isFancy=1;
                break;
            }else{
                pprevious=previous;
                previous=current;
                isFancy=0;
            }
        }
        return  isFancy;
    }
}
