import java.util.Scanner;
import java.util.Arrays;

public class subArray{
    public static void main(String[] args){
        /* we are print all the sub array
         * eg,. 1 2 3 4 5
         * output: 
         * 1
         * 1 2 
         * 1 2 3
         * 1 2 3 4 5
         * 2 
         * 2 3 
         * 2 3 4 
         * 2 3 4 5 
         * 3
         * 3 4 
         * 3 4 5 
         * 4
         * 4 5
         * 5
         * 
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        printSubArray(arr);

    }

    static void printSubArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
            for(int j=i+1;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }

    
}