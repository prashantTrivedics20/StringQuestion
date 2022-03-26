import java.util.Scanner;

public class PrintZigZag {
    public static void main(String[] args) {
        // write your code here
        Scanner readme=new Scanner(System.in);
        int n=readme.nextInt();
        pzz(n);
    }
    public static void pzz(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println("pre"+n);
        pzz(n-1);
        System.out.println("in"+n);
        pzz(n-1);
        System.out.println("post"+n);
    }
}
