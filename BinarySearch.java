import java.util.Scanner;
import java.util.Arrays;

public class BinarySearch{
    public static void main(String[] args){
        /* linear search is take lots of time for search key in given arr
         * linear search T.C = O(n)
         * so, now we use binary search for save time
         * binary search T.C = O(logn)
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter key: ");
        int k=sc.nextInt();
        Arrays.sort(arr);
        System.out.println(binarySearch(arr,k));
    }

    static boolean binarySearch(int arr[],int k){
        int start=0;        
        int end=arr.length-1;

        while(start<=end){
            int mid=(end+start)/2;
            if(arr[mid]==k)
                return true;

            if(arr[mid]>k){
                end=mid-1;
            }
            if(arr[mid]<k){
                start=mid+1;
            }
        }
        return false;
    }
}
