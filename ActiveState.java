public class ActiveState implements AccountState
{

    @Override
    public void activate(Account account) 
    {
        // TODO Auto-generated method stub
        System.out.println("--- Account is already activated!");
        account.setState(new ActiveState());
    };  
    @Override
    public void suspend(Account account) 
    {
        // TODO Auto-generated method stub
        System.out.println("--- Account is suspended!");
        account.setState(new SuspendState());
    }
    @Override
    public void closed(Account account) 
    {
        // TODO Auto-generated method stub
        System.out.println("--- Account is closed!");
        account.setState(new ClosedState());
    }
    @Override
    public void withdraw(Double withdrawAmount, Account account) 
    {
        System.out.println("--- [You make a withdrawal of funds.]");
        account.setBalance(account.getBalance() - withdrawAmount);
        System.out.println(account.toString());
        
    }
    @Override
    public void deposit(Double depositAmount, Account account) 
    {
        System.out.println("--- [You make a deposit of funds.]");
        account.setBalance(account.getBalance() + depositAmount); 
        System.out.println(account.toString());
    }
  
   
}
