public class ActiveState implements AccountState
{

    @Override
    public void activate(Account account) 
    {
        // TODO Auto-generated method stub
        System.out.println("Account is already activated!");
    };  
    @Override
    public void suspend(Account account) 
    {
        // TODO Auto-generated method stub
        System.out.println("Account is suspended!");
    }
    @Override
    public void closed(Account account) 
    {
        // TODO Auto-generated method stub
        System.out.println("Account is closed!");
    }
    @Override
    public void withdraw(Double withdrawAmount, Account account) 
    {
        account.setBalance(account.getBalance() - withdrawAmount);
        System.out.println(account.toString());
        
    }
    @Override
    public void deposit(Double depositAmount, Account account) 
    {
        account.setBalance(account.getBalance() + depositAmount); 
        System.out.println(account.toString());
    }
  
   
}
