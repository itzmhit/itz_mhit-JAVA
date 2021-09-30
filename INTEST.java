import java.util.*;
class INTEST
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        int ctr=0;
        for (int i=1;i<=n;i++)
        {
            int t=in.nextInt();
            if(t%k==0)
                ctr++;
        }
        System.out.println(ctr);
    }
}
