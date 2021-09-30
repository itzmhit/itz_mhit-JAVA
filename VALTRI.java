import java.util.*;
class VALTRI {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        if((n%5==0 && n%6==0)||(n%5==0 || n%6==0))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
