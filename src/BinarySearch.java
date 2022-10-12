public class BinarySearch {
    public static void main(String[] args){
        int[] arrList = {1,2,3,4,6,7,8,9,10};
        int item=10;
        int low=0;
        int high=arrList.length-1;
        int guess;
        int mid;

        while(low<=high){
            mid=(low+high)/2;
            guess=arrList[mid];
            if(guess==item){
                System.out.println("Item Found at"+mid);
                return;}
            else if(guess < item)
                low=mid+1;
            else if(guess > item)
                high = mid-1;
            else
                System.out.println("Item not Found");
        }
    }


}
