import java.util.*;
class RNGEODD {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int l=in.nextInt();
        int r=in.nextInt();
        for(int i=l;i<=r;i++)
            if(i%2!=0)
                System.out.println(i);
    }
}
