/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef2
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner readme=new Scanner(System.in);
        int t=readme.nextInt();
        for(int k=0;k<t;k++)
        {
            int n=readme.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<arr.length;i++)
            {
                arr[i]=readme.nextInt();
            }
            ArrayList<Integer>al=new ArrayList<>();
            for(int i=0;i<arr.length;i++)
            {
                for(int j=i+1;j<arr.length;j++)
                {
                    int res=arr[i]&arr[j];
                    al.add(res);
                }
            }
            while(al.size()!=1)
            {
                int max=al.get(0);
                int min=al.get(0);
                int maxindex=0;
                int mixindex=0;
                for(int i=1;i<al.size();i++) {
                    if (al.get(i) < max) {
                        max = al.get(i);
                        maxindex = i;
                    }
                    if (al.get(i) > min) {
                        min = al.get(i);
                        mixindex = i;
                    }

                }
                //System.out.println(max|min);
//                int res=max|min;
//                //System.out.println(res);
//               System.out.println(al.size());
//                al.add(al.size(),res);
//                System.out.println(maxindex);
//                System.out.println(mixindex);
                //System.out.println(al.size());
                al.remove(maxindex);
                al.remove(mixindex);
                int res=max|min;
                //System.out.println(res);
                System.out.println(al.size());
                al.add(al.size(),res);

                //System.out.println(al);

            }

            //System.out.println(al.get(0));
        }



    }
}
