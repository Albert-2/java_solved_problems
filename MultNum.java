//Question : Write a program to multiply N numbers without using *(multiplication) operator
import java.util.Scanner;

public class MultNum  
 {  
   public static void main(String[] args)   
   {  
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter number of elements to be multiplied :");
       int n=sc.nextInt();
       int a[]=new int[n];
       System.out.println("Enter your elements:");
       for(int i=0;i<n;i++)
       {
           a[i]=sc.nextInt();
       }
       for(int i=1;i<n;i++)
       {
           int sum=0;
           for(int j=0;j<a[i];j++)
           {
               sum=sum+a[i-1];
           }
           a[i]=sum;
       }
    System.out.println("Result :"+a[n-1]);   
   }  
 }