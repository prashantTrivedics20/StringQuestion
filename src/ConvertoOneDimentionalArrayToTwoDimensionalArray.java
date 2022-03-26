import java.util.Scanner;

public class ConvertoOneDimentionalArrayToTwoDimensionalArray {
    public static int[][] construct2DArray(int []arr,int m,int n)
    {
        int length=arr.length;
        if(length!=m*n)
        {
            return new int[0][0];// empty 2-D array
        }
        else
        {
        int ans[][]=new int[m][n];
        for (int i = 0; i <length ; i++) {
            int nr=i/n;// number of row
            int nc=i%n;// number of column
            ans[nr][nc]=arr[i];
        }
        return ans;
        }
    }
    public static void main(String[] args) {
        Scanner readme=new Scanner(System.in);
        System.out.println("Enter the size of 1-D array->");
        int size=readme.nextInt();
        int arr[]=new int[size];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=readme.nextInt();
        }
        System.out.println("Enter the number of rows in 2-D array");
        int m=readme.nextInt();
        System.out.println("Enter the number of column in 2-D array");
        int n=readme.nextInt();
        int a[][]=construct2DArray(arr,m,n);
        for (int i = 0; i <m; i++) {
            for (int j = 0; j <n; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
