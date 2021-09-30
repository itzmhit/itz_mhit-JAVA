import java.util.*;
class AIRLINE
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int T=in.nextInt();
        int i;
        if(T>0 && T<36001)
        {
            for(i=0;i<T;i++)
            {
                int A=in.nextInt(); //Bag
                int B=in.nextInt(); //Bag
                int C=in.nextInt(); //Bag
                int D=in.nextInt(); //Check In Limit
                int E=in.nextInt(); //Carry Limit
                if(A>0 && A<11 && B>0 && B<11 && C>0 && C<11 && D>14 && D<21 && E>4 && E<11)
                {
                    if((A+B)<=D && C<=E)
                    {
                        System.out.println("YES");
                    }
                    else if((B+C)<=D && A<=E)
                    {
                        System.out.println("YES");
                    }
                    else if((A+C)<=D && B<=E)
                    {
                        System.out.println("YES");
                    }
                    else
                        System.out.println("NO");
                }
            }
        }
    }
}
