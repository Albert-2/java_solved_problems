// Question: Write a Java program to find the index of the unique characters in a given string, assume that there is at least one unique character in the string.

import java.util.Scanner;

public class SpecialIndex 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count=0,counter=0;
        for(int i=0;i<str.length();i++)
        {
           if(!Character.isDigit(str.charAt(i))&&!Character.isWhitespace(str.charAt(i))&&!Character.isLetter(str.charAt(i)))
           {
            count++;
            System.out.println("special character at index "+(i+1));
           }
           else
           {
            counter++;
           }
        }
        System.out.println("Number of special characters "+count);
        System.out.println("Number of Non-special characters "+counter);
    }    
}
