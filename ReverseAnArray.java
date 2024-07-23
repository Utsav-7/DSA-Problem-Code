import java.util.Scanner;
import java.util.Arrays;

public class ReverseAnArray{
    public static void main(String[] args){
        /* we are reverse an array 
         * so, we use first and last two pointer
         * and we swap the value of first and last pointer value
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        reverseAnArray(arr);

        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void reverseAnArray(int arr[]){
        int first=0;
        int last=arr.length-1;

        while(first<=last){
            int temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;

            first++;
            last--;
        }
    }

    
}
