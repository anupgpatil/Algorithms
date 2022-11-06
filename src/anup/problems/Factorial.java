package anup.problems;

public class Factorial {
    public static void main(String args[]) {

        //Find the factorial of a given Number
        //q->4 , ands->4*3*3*1=24

        int q=7;
        int temp=q;
        int res=1;
        while(temp>0){
            res=res*temp;
            temp--;
        }
        System.out.println("Factorial of "+q +" is :"+res);
        System.out.println("Factorial of "+q +" using recursive function is :"+recursiveFactorial(q));

    }

    private static int recursiveFactorial(int q){
        if (q==0){
            return 1;
        }
        else{
            return q*recursiveFactorial(q-1);
        }
    }
}
