import java.util.Scanner;
import java.util.Arrays;

public class SumOfSubArray{
    public static void main(String[] args){
        /* we are print maximum sum of the sub array
         * eg,. 1 2 3 4 5
         * output: 34 
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Max Sum is: "+ MaxSumofArray(arr));

    }

    static int MaxSumofArray(int arr[]){
        int maxSum=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i+1;j<arr.length;j++){

                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                }
                System.out.print(sum+" "); // print all the sub array sum
                if(sum>maxSum)
                    maxSum=sum;
                System.out.println();
            }
        }
        return maxSum;
    }

    
}