import java.util.*;
class EXTRICHK {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        if((a==b && b==c && c==a) && a>0 && b>0 && c>0 && a+b>c && b+c>a && c+a>b)
            System.out.println("1");
        else if((a==b || b==c || c==a) && a>0 && b>0 && c>0 && a+b>c && b+c>a && c+a>b)
            System.out.println("2");
        else if((a!=b || b!=c || c!=a) && a>0 && b>0 && c>0 && a+b>c && b+c>a && c+a>b)
            System.out.println("3");
        else
            System.out.println("-1");
    }
}
