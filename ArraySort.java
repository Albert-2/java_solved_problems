//Question : Sorting the array elements in decending order OR "Bubble Sorting"

import java.util.*;

public class ArraySort 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements to be sort:");
        int n=sc.nextInt();
        int [] a = new int[n];
        int temp;
        System.out.println("Enter the numbers : ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();    
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1;j++)
            {
            if(a[j]<a[j+1])
            {
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
            }
        }
        System.out.print("The sorted array ");
        for(int i=0;i<n;i++)
        {
           System.out.print(a[i]+" ");   
        }
        sc.close(); 
    }    
}
