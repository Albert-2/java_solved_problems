//Question : Calculate the digits contained in the given Number without using strings. 

import java.util.*;

public class DigitsInNumber 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int s = sc.nextInt();
        int a=0;
        while(s>0)
        {
            s=s/10;
            a++;
        }
        System.out.println(a);    
    }    
}
