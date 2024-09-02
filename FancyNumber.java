
public class FancyNumber {

    public static void main(String[] args) {
        System.out.println("Is Fancy Number?");
        System.out.println(IsFancyNumberMethod(6));
        System.out.println(IsFancyNumberMethod(17));
        System.out.println(IsFancyNumberMethod(61));
        System.out.println(IsFancyNumberMethod(217));

    }

    public static int IsFancyNumberMethod(int num) {

        //Fancy Numbers are These Numbers :- {1,1,5,17,61,217,....}
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
