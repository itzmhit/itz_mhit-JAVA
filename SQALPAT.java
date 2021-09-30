import java.util.*;
class SQALPAT {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a=1;
        for(int i=1;i<=n;i++)
        {
            if(i%2!=0)
            {
                for(int j=1;j<=5;j++)
                {
                    System.out.print(a+" ");
                    a++;
                }
            }
            else if(i%2==0)
            {
                int b=a+4;
                for(int j=1;j<=5;j++)
                {
                    System.out.print(b+" ");
                    b--;
                    a++;
                }
            }
            System.out.println();
        }
    }
}
