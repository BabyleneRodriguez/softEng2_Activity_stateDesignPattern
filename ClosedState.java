public class ClosedState implements AccountState
{   
    public void activateState(Account account){
        System.out.println("You can't activate a closed account!");
    };

    public void suspendState(Account account){
        System.out.println("You can't suspend a closed account!");
    };
    public void closeState(Account account){
        System.out.println("Account already closed");
    };
    
    public void deposit(Double depositAmount, Account account){
        System.out.println("You can't deposit with a closed account!");
    };
    public void withdraw(Double withdrawAmount, Account account){
        System.out.println("You can't witdhraw with a closed account!");
    };
}
