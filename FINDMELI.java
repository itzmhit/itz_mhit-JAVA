import java.util.*;
class FINDMELI {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a[] = new int[200000];
        int n = in.nextInt();
        int k = in.nextInt();
        int ctr = 0;
        for (int i = 0; i < n; i++)
            a[i] = in.nextInt();
        for (int i = 0; i < n; i++) {
            if (a[i] == k) {
                System.out.println("1");
                ctr++;
                break;
            }
        }
        if (ctr==0)
            System.out.println("-1");
    }
}