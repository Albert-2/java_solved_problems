// Question:Java program to find the geometric mean of n numbers

import java.util.*;

public class GeometricMean 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers you are entering:");
        int n=sc.nextInt();
        int p=1;
        int[]a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            p=p*a[i];
        }
        System.out.println((float)Math.pow(p,(float)1 / n));
        sc.close();
    }    
}
