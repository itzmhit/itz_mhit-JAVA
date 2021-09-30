import java.util.*;
class ISBOTH {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if ((n % 5 == 0 && n % 11 != 0) || (n % 5 != 0 && n % 11 == 0))
            System.out.println("ONE");
        else if (n % 5 == 0 && n % 11 == 0)
            System.out.println("BOTH");
        else
            System.out.println("NONE");
    }
}
