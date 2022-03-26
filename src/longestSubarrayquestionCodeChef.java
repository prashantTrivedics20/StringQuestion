// perform bitwiseand and  find the longest subarray

import java.util.Scanner;
import java.util.*;

public class longestSubarrayquestionCodeChef {
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        System.out.println("Enter the number of element in an array");
        int n=readme.nextInt();
        int arr[]=new int[n];
//        for (int i = 0; i <arr.length; i++) {
//            arr[i]=readme.nextInt();
//        }
        double b=Math.log(n)/Math.log(2);
        int p= (int)b;
        System.out.println(p);
        int k=(int)Math.pow(2,p);
        int x=k/2;
        int y=n-k+1;
        if(x>y)
        {
            System.out.println(x);
        }
        else
        {
            System.out.println(y);
        }



    }
}
