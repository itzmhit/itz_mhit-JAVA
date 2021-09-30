import java.util.*;
class FLOW004
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int T=in.nextInt();
        int d,rev,c,sum;
        for(int i=1;i<=T;i++) {
            int n = in.nextInt();
            c=n;
            sum=0;
            rev=0;
            while(n>0)
            {
                d=n%10;
                rev=rev*10+d;
                n=n/10;
            }
            sum=rev%10+c%10;
            System.out.println(sum);
        }
    }
}
