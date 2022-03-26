/* Name of the class has to be "Main" only if the class is public. */
import java.util.*;
class Codechef1
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scan = new Scanner(System.in);
	    int t=scan.nextInt();
	    for(int j=0;j<t;j++){
	        int n=scan.nextInt();
	        String s=scan.next();
	        int c=0;
	        for(int i=0;i<s.length()-1;i++){
	            if(s.charAt(i)==s.charAt(i+1))
	            s=s.substring(0,i)+s.substring(i+1);
            }
	    System.out.println(s.length());

	}
}
}
