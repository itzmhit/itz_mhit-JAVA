import java.util.*;
class REVMEE {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int a[]=new int[200000];
        int n=in.nextInt();
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        for (int i=n-1;i>=0;i--)
            System.out.println(a[i]);
    }
}
