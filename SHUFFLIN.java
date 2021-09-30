import java.util.*;
class SHUFFLIN
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();

        while(T>0) //test case
        {
            int N = in.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) //Input
                A[i] = in.nextInt();
            int e = 0, o = 0;
            for (int i = 0; i < N; i++)
            {
                if ((i + 1 + A[i]) % 2 == 0)
                {
                    if (A[i] % 2 == 0)
                        e++;
                    else
                        o++;
                }
            }
            int sum = (N-(Math.abs(e - o)));
            System.out.println(sum);
            T--;
        }

    }
}