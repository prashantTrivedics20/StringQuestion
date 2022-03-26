/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner readme=new Scanner(System.in);
        int t=readme.nextInt();
        for(int j=0;j<t;j++)
        {
            int n=readme.nextInt();
            String s=readme.next();
            StringBuffer str=new StringBuffer(s);
            ArrayList<Integer> al=new ArrayList<>();

            for(int i=0;i<str.length()-1;i++)
            {
                int c=0;
                if(str.charAt(i)==str.charAt(i+1))
                {
                    c=2;
                    al.add(c);
                    str.delete(i,i+2);
                    i=i-1;

                }

                else
                {
                    al.add(1);
                }
            }
            int f=0;
            for(int i=0;i<al.size();i++)
            {
                if(al.get(i)==2)
                {
                    f++;
                }
            }
            System.out.println(al.size()+1);

        }
    }
}
///* package codechef; // don't place package name! */
//
//import java.util.*;
//import java.lang.*;
//import java.io.*;
//
///* Name of the class has to be "Main" only if the class is public. */
//class Codechef
//{
//	public static void main (String[] args) throws java.lang.Exception
//	{
//	    Scanner scan = new Scanner(System.in);
//	    int t=scan.nextInt();
//	    for(int j=0;j<t;j++){
//	        int n=scan.nextInt();
//	        String s=scan.next();
//	        int c=0;
//	        for(int i=0;i<s.length()-1;i++){
//	            if(s.charAt(i)==s.charAt(i+1))
//	            s=s.substring(0,i)+s.substring(i+1);
//	    }
//	    System.out.println(s.length());
//
//	}
//}
//}
