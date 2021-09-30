import java.util.*;
class DIFACTRS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ctr=0,j=0;
        int a[]=new int[200];
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                ctr++;
                a[j]=i;
                j++;
            }
        }
        System.out.println(ctr);
        for (int i=0;i<j;i++)
            System.out.print(a[i]+" ");
    }
}
