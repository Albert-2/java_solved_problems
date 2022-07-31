import java.util.*;
import java.math.*;

public class SolvedProblem0 
{
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       int x = sc.nextInt();
       int [][] a = new int[x][3];
       for(int p=0;p<x;p++)
       {
       for(int q=0;q<3;q++)
       {
       a[p][q] = sc.nextInt();
       }
       }
       for(int i=0;i<x;i++)
       {
            int n = a[i][0]+a[i][1];
            System.out.print(n+" ");
        for(int j=1;j<a[i][2];j++)
        {
            n=(int)(n+(Math.pow(2, j)*a[i][1]));
            System.out.print(n+" ");
        }
        System.out.println();
       }
    }
}











