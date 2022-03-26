// reverse each words in java

//import java.util.StringTokenizer;
import java.util.*;

public class ReverseEachWordsInGivenString {
    public static void main(String[] args) {
        // approach 1->
        String str="java code";
        // out put should be-  avaj edoc
        StringTokenizer s=new StringTokenizer(str);
        while(s.hasMoreTokens())
        {
            String s1=s.nextToken();
            for (int i=s1.length()-1;i>=0;i--) {
                System.out.print(s1.charAt(i));
            }
            System.out.print(" ");
        }
        // approach 2>
//        System.out.println("Original String :: "+str);
//        String []words=str.split("");
//        String output=" ";
//        for(String word:words)
//        {
//            // reverse word
//            String revWords=" ";
//            for (int i = word.length()-1; i >=0 ; i--) {
//                revWords=revWords+word.charAt(i);
//            }
//            output=output+revWords+" ";
//        }
//        System.out.println(output);
//

    }

}
