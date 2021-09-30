import java.util.*;
class SUMEVOD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        long ectr=0,octr=0,esum=0,osum=0,i=1;
        while(ectr!=n)
        {
            if(i%2==0) {
                esum = esum + i;
                ectr++;
            }
            i++;
        }
        i=1;
        while(octr!=n)
        {
            if(i%2!=0) {
                osum = osum + i;
                octr++;
            }
            i++;
        }
        System.out.println(osum+" "+esum);
    }
}
