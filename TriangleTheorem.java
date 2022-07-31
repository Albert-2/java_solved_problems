// Question : Take side and angle as an input from the user and print the sides opposite of the remaining angles of a 30-60-90 TRIANGLE
import java.util.*;

public class TriangleTheorem 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of a side : ");
        int s = sc.nextInt();
        System.out.println("Enter the angle opposite of the given side : ");
        int ang = sc.nextInt();
        if(ang==30)
        {
           System.out.println("Length of the side opposite to the angle 60 is : "+(1.732*s));
           System.out.println("Length of the side opposite to the angle 90 is : "+(2*s));
        }
        else if(ang==60)
        {
           System.out.println("Length of the side opposite to the angle 30 is : "+(s/1.732));
           System.out.println("Length of the side opposite to the angle 90 is : "+((2*s)/1.732));
        }
        else if(ang==90)
        {
           System.out.println("Length of the side opposite to the angle 30 is : "+(s*0.5));
           System.out.println("Length of the side opposite to the angle 60 is : "+((1.732*s)/2));
        }
        else
        System.out.println("Enter the valid Angle");
    }   
}
