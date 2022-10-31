package anup.problems;

public class CountDigits {

    public  static void main(String Args[] ){
        //Given an integer  > 0 , count the digits in the integer
        //Fox ex: q: 67419, ans: 5
        int q = 123456;

        int res = 0;
        while(q>0){
            q=q/10;
            res++;
        }
        System.out.println("Digits : "+res);
    }
}
