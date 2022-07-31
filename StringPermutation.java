// Question: Write a Java program to check if a given string is a permutation of another given string

import java.util.Scanner;

public class StringPermutation 
{
    static int counter =0;
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        String temp="";
        int count =0;
        String str1 = sc.next();    
        String str2 = sc.next();
            if(str1.length()!=str2.length())
            {
                throw new Exception("Strings of Different length");
            }
            else
            {
                for(int i=0;i<str1.length();i++)
                {
                   for(int j=0;j<str1.length();j++)
                   {
                    if(str1.charAt(i)==str2.charAt(j))
                    {
                        count++;
                    }
                   } 
                }
                if(count==str1.length())
                System.out.println("Yes,The strings are showing String Permutation..");
                else
                System.out.println("Strings are not showing Permutation");
            }
    } 
}
