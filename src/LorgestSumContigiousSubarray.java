import java.util.*;
import java.util.Scanner;

public class LorgestSumContigiousSubarray {
    public static int maxSumArraySum(int a[],int size)
    {
        int max_so_far=a[0];
        int curr_max=a[0];
        for (int i = 0; i <size; i++) {
            curr_max=Math.max(a[i],curr_max+a[i]);
            max_so_far=Math.max(max_so_far,curr_max);
        }
        return max_so_far;
    }
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        System.out.println("Enter the size");
        int size=readme.nextInt();
        int arr[]=new int[size];
        for (int i = 0; i <arr.length; i++) {
            arr[i]=readme.nextInt();
        }
        int max_sum=maxSumArraySum(arr,arr.length);
        System.out.println(max_sum);
    }
}
