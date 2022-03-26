// this is the question we are solved this in order of O(n) complexity...
// find the subarray whose sum is 33...
import java.util.Scanner;
public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        System.out.println("Enter the element that you want to insert in the array");
        Scanner readme=new Scanner(System.in);
        int n=readme.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=readme.nextInt();
        }
        int lp=0;
        int rp=0;
        int current=0;
        int sum=33;
        for (int i = 0; i < arr.length; i++) {
            current=current+arr[i];
            if(current<sum)
            {
                rp++;
            }
            else if(current>=33)
            {
               current= current-arr[i];
               lp++;

            }
        }
        System.out.println("this is the sub array whose sum is 33 ->");
        for(int i=lp;i<=rp;i++)
        {
            System.out.print(arr[i]+" ");
        }



    }
}
