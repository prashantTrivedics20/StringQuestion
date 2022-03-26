import java.util.Scanner;

public class TowerOfHanoiQuestion {
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in );
        System.out.println("Enter the number of disk");
        int n=readme.nextInt();
        System.out.println("Enter the first tower");
        int t1id=readme.nextInt();
        System.out.println("Enter the second tower");
        int t2id=readme.nextInt();
        System.out.println("Enter the third tower");
        int t3id=readme.nextInt();
        toh(n,t1id,t2id,t3id);

    }
    public static void toh(int n,int t1id,int t2id,int t3id)
    {
        if(n==0)
        {
            return;
        }
        toh(n-1,t1id,t3id,t2id);// will print the instruction to move (n-1) disk from t1 to t3 using t2(*)
        System.out.println(n+"["+t1id+" -> "+t2id+"]");// move nth t1id to t2id
        toh(n-1,t3id,t2id,t1id);

    }
}
