class AuthenticationKeyQuestion
{


    public static void generator(String input1)

    {
       StringBuilder sb=new StringBuilder(input1);
        //int i=0;
        // while(sb.length()>0)
        // {
        // 	char ch=sb.charAt(i);
        // 	int n=ch-'0';
        // 	int sum=0;
        // 	sb.deleter(i);
        // }
        String str="";
        int c=1;

        for(int i=0;i<sb.length();i++)
        {

        int n=sb.charAt(i)-'0';
        int sum=0;
        if(n%2==0)
        {
        String s=sb.substring(i+1);
        StringBuilder sbn=new StringBuilder(s);
        int j=0;
        while(sbn.length()>0)
        {
        int num=sbn.charAt(j)-'0';


        sum=n+num+sum;
        c++;
        if(sum%2==1)
        {
        str=str+Integer.toString(sum);
        i=0;
        break;
        }
        sbn.deleteCharAt(j);
        }
        }
        if(n%2==1)
        {
        String s=sb.substring(i+1);
        StringBuilder sbn=new StringBuilder(s);
        int j=0;
        while(sbn.length()>0)
        {

        int num=sbn.charAt(j)-'0';
        c++;

        sum=n+num+sum;
        if(sum%2==0)
        {
        str=str+Integer.toString(sum);
        i=0;
        break;
        }
        sbn.deleteCharAt(j);
        }
        }

        i=c;



        }
     System.out.println(c);
        //return Integer.parseInt(str);
        }

    public static void main(String[] args) {
        String s="56745678987";
       generator(s);
        System.out.println();

    }
}



