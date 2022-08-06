public class AllThreeDigitArmstr 
{
    public static void main(String[] args) 
    {
        for(int i=100;i<1000;i++)
        {
            if(isArmstrong(i))
            {
                System.out.print(i+" ");
            }
        } 
    }   
    static boolean isArmstrong(int n)
    {
        int sum=0;
        int temp = n;
        while(n>0)
        {
        int remainder = n%10;
        sum = (int)(sum+Math.pow(remainder, 3));
        n=n/10;
        }
        return sum==temp;
    }    
}
