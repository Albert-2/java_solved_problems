import java.util.*;

public class FibonacciNo 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many Members you wanto print out : ");
        int a = sc.nextInt();
        int m=0,n=1,temp;
        System.out.print(m+" "+n+" ");
            for(int i=0;i<a-2;i++)
            {
               temp=n;
               n=m+n;
               System.out.print(n+" ");
               m=temp;
            }
            sc.close();
    }    
}
