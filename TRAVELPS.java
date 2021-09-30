import java.util.*;
class TRAVELPS
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int T=in.nextInt(); //number of text cases
        int i,j,N,time=0,a,b,n;
        if(T>0 && T<101)
        {
            for(i=0;i<T;i++) {
                n = in.nextInt();
                a = in.nextInt(); //minutes to fill each inter-district e-pass application
                b = in.nextInt(); //minutes for each inter-state e-pass application

                if(n>0 && n<101 && a>0 && a<101 && b>0 && b<101)
                {
                    String s=in.next();
                    time=0;
                    for(j=0;j<n;j++)
                    {
                        char ch=s.charAt(j);
                        if(ch=='0')
                        {
                            time=time+a;
                        }
                        else if(ch=='1')
                        {
                            time=time+b;
                        }
                    }
                    System.out.println(time);
                }
            }
        }

    }
}
