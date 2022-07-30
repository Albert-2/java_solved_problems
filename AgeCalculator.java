//Question : Calculate the Age by implementing methods in java.time package..

import java.util.*;
import java.time.*;


public class AgeCalculator 
{
    public static void main(String[] args) 
    {
        LocalDate today = LocalDate.now();
        System.out.println("Todays date is "+today);
        LocalDate birthDate = LocalDate.of(2000, 11, 17);
        int years = Period.between(birthDate, today).getYears();
        int months = Period.between(birthDate, today).getMonths();
        int days = Period.between(birthDate, today).getDays();
        System.out.println("You are "+years+" years "+months+" months "+days+" days older");
    }    
}
