//A child is running up a staircase with N steps and can hop either 1 step, 2 steps or 3 steps at a time.
// Implement a method to count how many possible ways the child can run-up to the stairs.
// You need to return the number of possible ways W.
//
//Sample Input :
//4
//Sample Output  :
//7
import  java.util.*;
public class GetStairPath1 {
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        int n=readme.nextInt();
        ArrayList<String>paths=getStairPath(n);
        System.out.println(paths);
    }
    public static ArrayList<String> getStairPath(int n)
    {
        if(n==0)
        {
            ArrayList<String>bres=new ArrayList<>();
            bres.add("");
            return bres;
        }
        else if(n<0)
        {
            ArrayList<String>bres=new ArrayList<>();
            return bres;
        }
        ArrayList<String>paths1=getStairPath(n-1);// faith 1(n-1 to 0)
        ArrayList<String>paths2=getStairPath(n-2);// faith 2(n-2 to 0)
        ArrayList<String>paths3=getStairPath(n-3);// faith 3(n-3 to 0)
        ArrayList<String>paths=new ArrayList<>();
        for(String path:paths1)
        {
            paths.add(1+path);
        }
        for(String path:paths2)
        {
            paths.add(2+path);
        }
        for(String path:paths3)
        {
            paths.add(3+path);
        }
        return paths;


    }
}
