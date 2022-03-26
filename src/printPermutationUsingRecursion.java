import java.util.Scanner;

public class printPermutationUsingRecursion {
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        String str=readme.nextLine();
        printPermutation(str,"");

    }
    public static void printPermutation(String str,String asf)
    {
        if(str.length()==0)
        {
            System.out.println(asf);
            return;
        }
        for (int i = 0; i <str.length() ; i++) {
            char ch=str.charAt(i);
            String lfpart=str.substring(0,i);
            String rpart=str.substring(i+1);
            String respart=lfpart+rpart;
            printPermutation(respart,asf+ch);
        }
    }

}
