public class Account {
    private String accountNum;
    private Double balance;
    private AccountState accountState;

    public Account(String accountNum, Double balance){
        this.accountNum = accountNum;
        this.balance = balance;
        accountState =  new ActiveState();
    }

    public String toString(){
        return "Account Number: " + accountNum + "\n " + "Balance: " + balance;
    }

    public AccountState getState(){
        return accountState;
    }

    public void setState(AccountState accountState){
        this.accountState = accountState;
    }

    public void activate(){
        accountState.activateState(this);
    }

    public void suspend(){
        accountState.suspendState(this);
    }

    public void close(){
        accountState.closedState(this);
    }

    public void deposit(Double depositAmount){
        accountState.deposit(depositAmount, this);
    }

    public void withdraw(Double withdrawAmount){
        accountState.deposit(withdrawAmount, this);
    }

    public Double getBalance(){
        return balance;
    }
    public void setBalance(Double balance){
        this.balance=balance;
    }

    public String getAccountNumber(){
        return accountNum;
    }
    public void setAccountNumber(){
        this.accountNum=accountNum;
    }
}