import java.util.*;
class FLOW006
{
    public static void main (String[] args)
    {
        Scanner in=new Scanner(System.in);
        int arr[]=new int[1000];
        int n=in.nextInt();
        if(n>=1 && n<=1000)
        {
            for(int i=0;i<n;i++)
                arr[i]=in.nextInt();
            for(int i=0;i<n;i++)
            {
                int sum=0;
                while(arr[i]>0)
                {
                    int d=arr[i]%10;
                    sum=sum+d;
                    arr[i]=arr[i]/10;
                }
                System.out.println(sum);
            }
        }
    }
}
