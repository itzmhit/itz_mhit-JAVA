import java.math.BigInteger;
import java.util.*;
class FCTRL2
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int T=in.nextInt();
        for(long i=1;i<=T;i++) {
            int n= in.nextInt();
            BigInteger fact=new BigInteger("1");
            for(long j=1;j<=n;j++) {
                fact = fact.multiply(BigInteger.valueOf(j));
            }
            System.out.println(fact);
        }
    }
}
