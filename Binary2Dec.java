//Question : Convert the user enetered number from Decimal To Binary Numerical System 

import java.util.*;

public class Binary2Dec 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number here : ");
        int n = sc.nextInt();
        int [] a = new int[8];
        for(int i=0;i<8;i++)
        {
            a[i] = n%2;
            n=n/2;
        }
        for(int j=7;j>=0;j--)
        {
            System.out.print(a[j]);
        }
    }       
}