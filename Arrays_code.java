import java.util.Scanner;
import java.util.Arrays;
public class Arrays_code{
    public static void main(String[] args){

        int arr[]=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int arr1[]={41,235,33,214,543,2,3,1};
        double arr2[]={32.3,43.4,5,65.3,53.2};
        String str[]={"mango", "apple","orange"};
        System.out.println("------------------------------");
        System.out.println(arr1.length);   // print length of array
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        Arrays.sort(arr1);
        Arrays.sort(str);
        for(int i=0;i<str.length;i++){
            System.out.println(str[i]);
        }
    }
}