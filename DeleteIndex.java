import java.util.*;

public class DeleteIndex 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many ArrayMembers you wanto enter: ");
        int n=sc.nextInt();
        int []a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Do you wanto delete any element from an array:");
        System.out.println("1 for yes,0 for no");    
        int ans = sc.nextInt();
        if(ans==1)
        {
            System.out.println("Enter the index number:");
            int m = sc.nextInt();
            int [] b=new int[n-1];
            for(int i=0;i<n-1;i++)
            {
                if(i==m)
                {
                    for(int j=i;j<n-1;j++)
                    {
                         b[j]=a[j+1];
                    }
                    break;
                }
                else
                b[i]=a[i];
            }
            System.out.println("Updated Array");
            for(int i=0;i<n-1;i++)
            {
                System.out.print(b[i]+" ");
            }
        }
        sc.close();
    }    
}
