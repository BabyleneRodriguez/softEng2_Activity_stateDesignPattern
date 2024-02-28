public class Account 
{
    private String accountNumber;
    private Double balance;
    private AccountState accountState;

    public Account (String accountNumber, Double balance)
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
        accountState =  new ActiveState();
    }

    public String getAccountNumber()
    {
        return accountNumber;
    }
    public void setAccountNumber()
    {
        this.accountNumber = accountNumber;
    }

    public Double getBalance()
    {
        return balance;
    }
    public void setBalance(Double balance)
    {
        this.balance=balance;
    }

    public AccountState getState()
    {
        return accountState;
    }

    public void setState(AccountState accountState)
    {
        this.accountState = accountState;
    }

    public void activate()
    {
        accountState.activate(this);
    }

    public void suspend()
    {
        accountState.suspend(this);
    }

    public void close()
    {
        accountState.closed(this);
    }

    public void deposit(Double depositAmount)
    {
        accountState.deposit(depositAmount, this);
    }

    public void withdraw(Double withdrawAmount)
    {
        accountState.withdraw (withdrawAmount, this);
    }

    public String toString()
    {
        return "\tAccount Number: " + accountNumber + "\n" + "\tBalance: " + balance;
    }
}