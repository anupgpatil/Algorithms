package anup.problems;

public class FactorialTrailingZeros {

    public static void main(String asrgs[]){
        //Given a nmumber, identify the trailing zeros in th factorial of the number
        //Ex: q:5 , 5!=120, ans=1;
        //Ex: q:10, 10!=3628800 , ans=2

        int q=10;
        int temp=q;
        int res=1;
        while(q>0){
            res=res*q;
            q--;
        }
        System.out.println("Factorial  is :"+res);
        int count=0;
        while(res%10==0){
            count++;
            res=res/10;
        }
        System.out.println("Trailing zero Factorial  is :"+count);
        System.out.println("Trailing zero Factorial  by Efficient Coding is :"+efficientCoding(temp));


    }

    private static int efficientCoding(int q){
        //This method involves counting all multiples of 5 to get trailing zero's
        int res=0;
        for(int i=5;i<=q;i=i*5){
            res=res+q/5;
        }
        return res;
    }

}
