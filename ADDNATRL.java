import java.util.*;
class ADDNATRL {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n=in.nextLong();
        long sum=0;
        for(long i=1;i<=n;i++)
            sum=sum+i;
        System.out.println(sum);
    }
}
