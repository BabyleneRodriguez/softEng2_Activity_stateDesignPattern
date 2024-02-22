public class ActiveState implements AccountState
{
    public void activateState(Account account)
    {
        System.out.println("Account already active!");
    };
    public void suspendState(Account account)
    {
        System.out.println("Account suspended!");
        account.setState(new SuspendState());
    };
    public void closeState(Account account){
        System.out.println("Account closed!");
        account.setState(new ClosedState());
    };
    
    public void deposit(Double depositAmount, Account account)
    {
        account.setBalance(account.getBalance()+depositAmount); 
        System.out.println("Updated Balance: " + account);
    };

    public void withdraw(Double withdrawAmount, Account account){
        account.setBalance(account.getBalance()-withdrawAmount);
        System.out.println("Updated Balance: " + account);
    };
}
