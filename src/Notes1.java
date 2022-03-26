import java.util.Locale;
import java.util.Scanner;

public class Notes1 {
    //Substring of a Substring Problem Code: SUBSTRING
    //Add problem to Todo list
    //Submit
    //Shefin gives you a string S and you have to find a non-empty string P such that:
    //
    //P is a substring of S.
    //No non-empty substring of P is a prefix of S.
    //No non-empty substring of P is a suffix of S.
    //For all such possible strings, find the length of the longest string satisfying all the conditions. If no such string is possible, print −1.
    //
    //A string A is a substring of a string B if A can be obtained from B by deleting several (possibly zero) characters from the beginning and several (possibly zero) characters from the end.
    //A prefix of a string A, is a substring of A that occurs at the beginning of A. For example, "code" is a prefix of "codechef", but "ode" is not.
    //A suffix of a string A, is a substring of A that occurs at the end of A. For example, "chef" is a suffix of "codechef", but "he" is not.
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        String s="hellho";
        char ch1=s.charAt(0);
        char ch2=s.charAt(s.length()-1);
        int n=s.length()-1;
        s=s.replace(s.charAt(0),'#');
        s=s.replace(s.charAt(n),'#');
        s=s.replaceAll("[#]","");
        System.out.println(s);
    }
}
