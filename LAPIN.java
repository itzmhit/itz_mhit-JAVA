import java.util.*;
class LAPIN {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        String str1,str2;
        for(int i=0;i<t;i++)
        {
            String s=in.next();
            int len=s.length();
            if(len%2==0)
            {
                str1=s.substring(0,(len/2));
                str2=s.substring(len/2);
            }
            else
            {
                str1=s.substring(0,(len/2));
                str2=s.substring(len/2+1);
            }
            //sorting
            str1=sortString(str1);
            str2=sortString(str2);

            //Check
            if(str1.equals(str2))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
    static String sortString(String str) {
        char []arr = str.toCharArray();
        Arrays.sort(arr);
        return(String.valueOf(arr));
    }
}
