import java.util.*;

public class SolvedProblem3 
{
    static boolean bool = true;
    static int B, H;
    static 
    {
        Scanner scan = new Scanner(System.in);
        B = scan.nextInt();
        scan.nextLine();
        H = scan.nextInt();
        scan.close();
        if (B>0&&H>0) 
        {
            bool = true;
        } 
        else if (B<=0||H<=0) 
        {
            bool = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args) 
    {
        if (bool) 
        {
            int area = B * H;
            System.out.print(area);
        }

    }

}