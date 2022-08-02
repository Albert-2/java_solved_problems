//Question: Print n number of rows of the PASCAL TRIANGLE
import java.util.*;

class PascalTriangle
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number row to be printed: ");    
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                System.out.print(" ");
            }
            int l=1;
            for(int k=1;k<=i;k++)
            {
                System.out.print(l+" ");
                l=l*(i-k)/k;
            }
            System.out.println();
        }
    }
}
