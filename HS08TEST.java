/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        try
        {
            Scanner in = new Scanner(System.in);
            int x = in.nextInt();
            double y = in.nextDouble();
            if((x+0.50)>y)
                System.out.println(String.format("%.2f",y));
            else if(x%5!=0 || x<0 || y>=2000)
                System.out.println(String.format("%.2f",y));
            else {
                double d = y-(x+0.50);
                System.out.println(String.format("%.2f",d));
            }
        }
        catch(Exception e)
        {
            return;
        }

    }
}
