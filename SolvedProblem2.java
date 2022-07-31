import java.util.*;

public class SolvedProblem2 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (scanner.hasNext()) 
        {
            i++;
            System.out.println(i+" "+scanner.nextLine());
        }
        scanner.close();
    }
}