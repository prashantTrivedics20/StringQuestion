// hacker rank question
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        int n=readme.nextInt();
        for (int i = 1; i <=n ; i++) {
            int sum=0;
            for (int j =1; j <=i; j++) {
                sum=sum+j;
                if(j>1)
                {
                    System.out.print("+"+j);
                }
                else
                {
                    System.out.print(j+"");
                }
            }
            System.out.println("="+sum);
        }
    }
}

//5// 5 is the input
// output=>
//1=1
//1+2=3
//1+2+3=6
//1+2+3+4=10
//1+2+3+4+5=15