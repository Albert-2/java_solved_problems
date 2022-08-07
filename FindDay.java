//QUESTION: Take a Date as an input from user and return the Day  
import java.text.*;
import java.util.*;

public class FindDay 
{
    public static void main(String[] args) throws ParseException 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter date(DD MM YYYY):");
        String date1 = sc.nextLine();
        SimpleDateFormat date0 = new SimpleDateFormat("dd MM yyyy");
        Date date2 = date0.parse(date1);
        switch(date2.getDay())
        {
            case 0->System.out.println("Sunday");
            case 1->System.out.println("Monday");
            case 2->System.out.println("Tuesday");
            case 3->System.out.println("Wednesday");
            case 4->System.out.println("Thursday");
            case 5->System.out.println("Friday");
            case 6->System.out.println("Saturday");
        }
        sc.close();
    }    
}
