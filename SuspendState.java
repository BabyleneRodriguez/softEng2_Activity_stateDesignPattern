public class SuspendState implements AccountState
{
   
    @Override
    public void activate(Account account) 
    {
        // TODO Auto-generated method stub
        System.out.println("Account is activated!");
        account.setState(new ActiveState());
    }
    @Override
    public void suspend(Account account) 
    {
        // TODO Auto-generated method stub
        System.out.println("Account is already suspended!");
        account.setState(new SuspendState());
    }
    @Override
    public void closed(Account account) 
    {
        // TODO Auto-generated method stub
        System.out.println("Account is already closed!");
        account.setState(new ClosedState());
    };
    @Override
    public void withdraw(Double withdrawAmount, Account account) 
    {
        // TODO Auto-generated method stub
        account.setState(new SuspendState());
        System.out.println("Account suspended cannot withdraw!");
        System.out.println(account.toString());
    }
    @Override
    public void deposit(Double depositAmount, Account account) 
    {
        // TODO Auto-generated method stub
        account.setState(new SuspendState());
        System.out.println("Account suspended cannot deposit!");
        System.out.println(account.toString());
    }
    
   
    
}
