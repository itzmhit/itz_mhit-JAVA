import java.util.*;
class SECLAR {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[]=new int[3];
        for(int i=0;i<3;i++)
            arr[i]=in.nextInt();
        for (int i = 0; i < 3-1; i++)
            for (int j = 0; j < 3-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
        System.out.println(arr[1]);
    }
}
