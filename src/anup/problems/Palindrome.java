package anup.problems;

public class Palindrome {
    public static void main(String args[]) {
        //To Check if a number is palindrome
        //A number is palindrome if the value is same if it is read right to left or vice versa
        //q: 12321 ->palindrome
        //q: 7865 - !palindrome
        System.out.println("is "+ 67876+" a Palindrom ?"+isPalindrome(67876));
        System.out.println("is "+ 6+" a Palindrom ?"+isPalindrome(6));
        System.out.println("is "+ 4664+" a Palindrom ?"+isPalindrome(4664));
        System.out.println("is "+ 3216+" a Palindrom ?"+isPalindrome(3216));
    }


        private static boolean isPalindrome(int q){
        int temp=q;
        int res = 0;
        while(temp>0){
            res=res*10+mod10(temp);
            temp=divBy10(temp);
        }
        return res==q;
    }

    private static int mod10(int x){
        return x%10;
    }

    private static int divBy10(int x){
        return x/10;
    }
}
