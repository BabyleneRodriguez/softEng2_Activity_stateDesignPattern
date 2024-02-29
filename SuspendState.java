public class SuspendState implements AccountState
{
   
    @Override
    public void activate(Account account) 
    {
        // TODO Auto-generated method stub
        System.out.println("--- Account is activated!");
        account.setState(new ActiveState());
    }
    @Override
    public void suspend(Account account) 
    {
        // TODO Auto-generated method stub
        System.out.println("--- Account is already suspended!");
        account.setState(new SuspendState());
    }
    @Override
    public void closed(Account account) 
    {
        // TODO Auto-generated method stub
        System.out.println("--- You cannot suspend a closed account!");
        account.setState(new SuspendState());
    };
    @Override
    public void withdraw(Double withdrawAmount, Account account) 
    {
        // TODO Auto-generated method stub
        System.out.println("--- You cannot withdaraw with a suspended account!");
        System.out.println(account.toString());
        account.setState(new SuspendState());
    }
    @Override
    public void deposit(Double depositAmount, Account account) 
    {
        // TODO Auto-generated method stub
        System.out.println("--- You cannot deposit with a suspended account!");
        System.out.println(account.toString());
        account.setState(new SuspendState());
    }
    
   
    
}
