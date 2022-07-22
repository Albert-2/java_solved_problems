//Question : Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150 and $200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank', each having a method named 'getBalance'. Call this method by creating an object of each of the three classes.


abstract class Bank
{
    abstract void getBalance(int n);
}

class BankA extends Bank
{
    @Override
    public void getBalance(int n)
    {
        System.out.println("Balance available : $"+n);
    }
}
class BankB extends Bank
{
    @Override
    public void getBalance(int n)
    {
        System.out.println("Balance available : $"+n);
    }
}
class BankC extends Bank
{
    @Override
    public void getBalance(int n)
    {
        System.out.println("Balance available : $"+n);
    }
}


public class BalAbstraction 
{
    public static void main(String[] args) 
    {
        Bank obj0 = new BankA();
        Bank obj1 = new BankB();
        Bank obj2 = new BankC();
        obj0.getBalance(100);
        obj0.getBalance(150);
        obj0.getBalance(200);
        
    }    
}
